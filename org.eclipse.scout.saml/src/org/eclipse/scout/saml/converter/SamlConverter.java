/*******************************************************************************
 * Copyright (c) 2012, 2013 BSI Business Systems Integration AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     BSI Business Systems Integration AG - initial API and implementation
 ******************************************************************************/
package org.eclipse.scout.saml.converter;

import java.math.BigDecimal;
import java.util.regex.Pattern;

import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.xbase.conversion.XbaseValueConverterService;

import com.google.common.base.Strings;

/**
 * <h3>{@link SamlConverter}</h3>
 * 
 * @author mvi
 * @since 1.0.0 06.06.2013
 */
@SuppressWarnings("restriction")
public class SamlConverter extends XbaseValueConverterService {

  private final static char ESCAPE_CHAR = '^';
  private final static Pattern ESCAPE_CHAR_PATTERN = Pattern.compile("" + ESCAPE_CHAR, Pattern.LITERAL);

  private final IValueConverter<String> QUALIFIED_NAME_CONVERTER = new IValueConverter<String>() {
    @Override
    public String toValue(String string, INode node) throws ValueConverterException {
      if (string != null && string.indexOf(ESCAPE_CHAR) >= 0) {
        return ESCAPE_CHAR_PATTERN.matcher(string).replaceAll("");
      }
      return string;
    }

    @Override
    public String toString(String value) throws ValueConverterException {
      if (GrammarUtil.getAllKeywords(getGrammar()).contains(value)) {
        return ESCAPE_CHAR + value;
      }
      return value;
    }
  };

  @ValueConverter(rule = "QualifiedName")
  public IValueConverter<String> QualifiedName() {
    return QUALIFIED_NAME_CONVERTER;
  }

  private final IValueConverter<BigDecimal> BIGDECIMAL_TYPE_CONVERTER = new IValueConverter<BigDecimal>() {
    @Override
    public String toString(BigDecimal value) {
      return value.toString();
    }

    @Override
    public BigDecimal toValue(String string, INode node) throws ValueConverterException {
      if (Strings.isNullOrEmpty(string)) {
        throw new ValueConverterException("Could not convert empty string to BigDecimal.", node, null);
      }

      try {
        return new BigDecimal(string);
      }
      catch (NumberFormatException e) {
        throw new ValueConverterException("Could not convert '" + string + "' to BigDecimal.", node, e);
      }
    }
  };

  @ValueConverter(rule = "BigDecimalType")
  public IValueConverter<BigDecimal> BigDecimalType() {
    return BIGDECIMAL_TYPE_CONVERTER;
  }

  private final IValueConverter<Long> LONG_TYPE_CONVERTER = new IValueConverter<Long>() {
    @Override
    public String toString(Long value) {
      return value.toString();
    }

    @Override
    public Long toValue(String string, INode node) throws ValueConverterException {
      if (Strings.isNullOrEmpty(string)) {
        throw new ValueConverterException("Could not convert empty string to Long.", node, null);
      }

      try {
        return Long.parseLong(string);
      }
      catch (NumberFormatException e) {
        throw new ValueConverterException("Could not convert '" + string + "' to Long.", node, e);
      }
    }
  };

  @ValueConverter(rule = "LongType")
  public IValueConverter<Long> LongType() {
    return LONG_TYPE_CONVERTER;
  }
}
