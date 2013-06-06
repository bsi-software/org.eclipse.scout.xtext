/*******************************************************************************
 * Copyright (c) 2010 BSI Business Systems Integration AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     BSI Business Systems Integration AG - initial API and implementation
 ******************************************************************************/
package org.eclipse.scout.saml.converter;

import java.util.regex.Pattern;

import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.xbase.conversion.XbaseValueConverterService;

/**
 * <h3>{@link SamlConverter}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 06.06.2013
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
}
