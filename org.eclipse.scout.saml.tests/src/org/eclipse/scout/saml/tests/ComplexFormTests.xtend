package org.eclipse.scout.saml.tests

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.scout.saml.SamlInjectorProvider
import org.eclipse.scout.saml.saml.Model
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.resource.XtextResourceSet
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SamlInjectorProvider))
class ComplexFormTests {
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper

	@Inject
	private Provider<XtextResourceSet> resourceSetProvider;
	
	@Test
	def void testComplexFormsOverFiles() {
		val resourceSet = resourceSetProvider.get()
		'''
		module org.eclipse.scout.saml.tests.complex

		translation trans.text1 default_lang="text1_default" en="text1_en" de_CH="text1_de_CH"
		translation trans.text2 default_lang="text2_default"
		translation trans.text3 default_lang="text3_default"
		
		logic CodeLoadLogSnippet placement=inline {
		  "System.out.println(\"execLoadCodes\");"
		}
		
		logic FormLoadLogSnippet placement=server {
		  "System.out.println(\"execLoad\"); return formData;"
		}
		
		logic RegexValidationSnippet placement=inline {
			"if (rawValue != null && !rawValue.matches([A-Z0-9])) { throw new VetoException(ScoutTexts.get(\"InvalidValueMessageX\", rawValue)); } return rawValue;"
		}
		
		template CheckBoxField definition="org.eclipse.scout.rt.client.ui.form.fields.checkbox.AbstractCheckBox"
		
		code Departments id="\"Main\"" value_type="java.lang.String" text=trans.text1 {
		  code Germany id="2" value_type="java.lang.Integer"
		  code France id="3" value_type="java.lang.Integer" {
		    code Paris id="4" value_type="java.lang.Integer"
		    code Marseille id="5" value_type="java.lang.Integer"
		  }
		  
		  logic event=load exec=CodeLoadLogSnippet
		  logic event=load placement=inline {
		    "return null;"
		  }
		  logic placement=inline {
		    "public final static int CustomIntField = 101;"
		  }
		}
		
		lookup Levels {
		  logic placement=server {
		    "private LookupRow[] createDummyData() {
		        return new LookupRow[]{new LookupRow(100L, \"Value 1\"), new LookupRow(200L, \"Value 2\")};
		     }"
		  }
		  logic event=all placement=server {
		    "return createDummyData();"
		  }
		}
		
		form ComplexLogicTest modal=false columns=3 title=trans.text1 subtitle=trans.text2 width_pixels=1000  {
		  logic placement=server event=new_store {
		    "System.out.println(\"server call create\"); return formData;"
		  }
		  logic placement=inline event=new_store {
		    "System.out.println(\"inline logic between backendcall and client logic call\");"
		  }
		  logic placement=client event=new_store {
		    "System.out.println(\"client call create\");"
		  }
		  logic event=new_load exec=FormLoadLogSnippet
		  
		  logic InlineRefreshSnippet placement=client {
		    "System.out.println(\"client service refresh 2\");"
		  }
		  
		  key Refresh stroke="f5" {
		    logic event=activated placement=server {
		      "System.out.println(\"refresh on backend\"); return formData;"
		    }
		    logic event=activated placement=inline {
		      "System.out.println(\"inline refresh\");"
		    }
		    logic event=activated placement=client {
		      "System.out.println(\"client service refresh 1\");"
		    }
		    logic event=activated exec=InlineRefreshSnippet
		  }
		}
		
		form ComplexFieldTest {
		  sequence SequenceTest text=trans.text1 enabled=false visible=false label_visible=false width=2 width_pixels=600 {
		    string StringAreaTest text=trans.text1 enabled=false visible=false label_visible=false master=StringTest mandatory=true maxlen=64 height=4 width=2 width_pixels=100 horizontal_align=right
		    string StringTest text=trans.text2 enabled=false visible=false label_visible=false mandatory=true maxlen=128 height=1 width=2 width_pixels=200 horizontal_align=center uppercase=true
		  	string StringWrapped text=trans.text2 enabled=true visible=true label_visible=true wrap_text=true height=4
		  	string StringInputMasked text=trans.text2 enabled=true visible=true label_visible=true mask_input=true
		  	label LabelTest text=trans.text2 enabled=true visible=true wrap_text=true
		    string StringRegex text=trans.text1 mandatory=true regex_validation="[0-9]{1}"
		    string StringNamedValidationLogic text=trans.text1 mandatory=false {
		      logic event=validate_value exec=RegexValidationSnippet
		    }
		    string StringAnonymousValidationLogic text=trans.text1 mandatory=false {
		      logic event=validate_value placement=inline {
		        "if (rawValue != null && !rawValue.matches([A-Z0-9])) { throw new VetoException(ScoutTexts.get(\"InvalidValueMessageX\", rawValue)); } return rawValue;"
		      }
		    }		  	
		  }
		  group GroupTest text=trans.text2 columns=3 enabled=false visible=false label_visible=false border_visible=false border_decoration=line height=10 width=3 width_pixels=500 {
		    bigdecimal BigDecimalTest text=trans.text1 enabled=false visible=false percent=true grouping=false label_visible=false mandatory=true width=2 width_pixels=333 horizontal_align=left fraction_digits=4 min=20.2 max=200.002
		    bigdecimal BigDecimal2Test format="0000.00"
		    long LongTest text=trans.text1 enabled=false visible=false label_visible=false mandatory=true width=2 width_pixels=76 horizontal_align=left min=2 max=4 format="0000"
		    date DateTest text=trans.text2 enabled=false visible=false label_visible=false mandatory=true width=2 format="dd.MM.yyyy"
		    smartfield SmartFieldTest1 text=trans.text1 enabled=false visible=false label_visible=false mandatory=true code=Departments width=2 value_type="java.lang.String" max_row_count=5
		    list TestList1 text=trans.text1 enabled=false visible=false label_visible=false mandatory=true code=Departments width=2 value_type="java.lang.String"
		    button TestButton text=trans.text1 enabled=false visible=false process_button=false width=2 width_pixels=30 type=normal {
		      menu MenuTest1 text=trans.text1 enabled=true visible=true single_select=true multi_select=false empty_select=true type=cancel
		    }
		    table TestTable text=trans.text1 enabled=false visible=false label_visible=false height=6 width=3 width_pixels=700 {
		      menu MenuTest2 text=trans.text1 enabled=true visible=true single_select=false multi_select=true empty_select=true type=separator
		      column ColumnTest1 type=date visible=false text=trans.text1 width=30 displayable=false
		      column ColumnTest2 type=string visible=true text=trans.text2 width=31 displayable=true
		      column ColumnTest3 type=int visible=true text=trans.text1 width=32 displayable=true
		      column ColumnTest4 type=bigdecimal visible=true text=trans.text2 width=33 displayable=true
		    }
		    tabbox TestTabBox enabled=false visible=false width=3 width_pixels=650 {
		      tab TestTab1 text=trans.text1 enabled=false visible=false columns=1 {
		        list TestList2 text=trans.text2 enabled=true visible=true label_visible=true mandatory=false lookup=Levels width_pixels=100 value_type="java.lang.Long"
		        smartfield SmartFieldTest2 text=trans.text2 enabled=true visible=true label_visible=true mandatory=false lookup=Levels width_pixels=77 value_type="java.lang.Long" {
		          menu MenuTest3 text=trans.text2 enabled=false visible=false single_select=true multi_select=true empty_select=true type=normal
		        }
		      }
		      tab TestTab2 text=trans.text2 columns=1 {
		      	filechooser TestFileChooser1 text=trans.text1 enabled=false visible=false width=5 width_pixels=105 label_visible=false mandatory=true maxlen=300 mode=directory type=load default_directory="C:\\Users" show_directory=true show_filename=false show_extension=false
		        filechooser TestFileChooser2 text=trans.text2 mode=file type=store extensions="jpg jpeg png bmp gif" default_directory="C:\\Program Files" show_directory=false show_filename=true show_extension=true
		        radio_group TestRadioButtons text=trans.text1 enabled=false visible=false width=5 width_pixels=105 label_visible=false mandatory=true value_type="java.lang.Integer" {
		          option Opt1 text=trans.text1 value="10" enabled=false
		          option Opt2 text=trans.text2 value="20" visible=false
		          option Opt3 text=trans.text3 value="30"
		        }
		      }
		    }
		    custom_field CheckBoxCustom super_type=CheckBoxField text=trans.text1 enabled=false visible=false label_visible=false width=3 width_pixels=44
		    check TestCheckbox text=trans.text2 enabled=false visible=false width=3 width_pixels=102 label_visible=false mandatory=true
		    button TestOkButton text=trans.text2 process_button=true type=ok
		  }
		}
		'''.parse(resourceSet).assertNoErrors

		'''
		module test.aa.bb

		translation BuDatum default_lang="Bu-Datum"
		translation Text default_lang="Text"
		translation Valuta default_lang="Valuta"
		translation Sy default_lang="Sy"
		translation CpNr default_lang="Cp.-Nr."
		translation SollHaben default_lang="Soll/Haben"
		translation Saldo default_lang="Saldo"
		translation InfoF7Col default_lang="Info                                     F7"
		
		
		form TableTest {
			logic event=modify_load placement=server {
				"System.out.println(\"TableTest form startup\");
				formData.getStornoTable().addRow(new Object[]{new java.util.Date(), \"text\", new java.util.Date(), 15, 134592, \"sollhaben text\", 135.25});
				return formData;"
			}
			table StornoTable label_visible=false height=10 width=2 {
				menu InfoF7Menu text=InfoF7Col
				
				column ColBuDatum text=BuDatum type=date width=100
				column ColText text=Text type=string width=138
				column ColValuta text=Valuta type=date width=100 visible=false
				column ColSy text=Sy type=int width=27
				column ColCpNr text=CpNr type=int width=53
				column ColSollHaben text=SollHaben type=string width=222
				column ColSaldo text=Saldo type=bigdecimal width=160
			}
		}
		'''.parse(resourceSet).assertNoErrors
	}
}
