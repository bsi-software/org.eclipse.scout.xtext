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
	def void testTextRefOverFiles() {
		val resourceSet = resourceSetProvider.get()
		'''
		module ch.raiffeisen.dialba.common
		
		translation AboutMenu de="&Info..."
		translation Abschluss de="Abschluss"
		translation AbsichernRefinanz de="Absichern / Refinanz."
		translation AlteNeueKONr de="Alte / Neue KO-Nr."
		translation Anlegen de="Anlegen"
		translation ApplicationTitle de="Meine Applikation"
		translation Art de="Art"
		translation AuthorizationFailed de="Zugriff verweigert"
		translation Basiskredit de="Basiskredit"
		translation Bearbeiten de="Bearbeiten"
		translation BemF4 de="Bem.                                   F4"
		translation BeratungsModus de="Beratungs-Modus"
		translation BetragSpesen de="Betrag / Spesen"
		translation Buchungstext1 de="Buchungstext 1"
		translation Buchungstext2 de="Buchungstext 2"
		translation Buchungstext3 de="Buchungstext 3"
		translation CHF de="CHF"
		translation ContactVendorMenu de="BSI kontaktieren"
		translation DIALBA2020 de="DIALBA2020"
		translation DIALBA2020Title de="DIALBA2020"
		translation DatumEmission de="Datum / Emission"
		translation DepotText de="Depot"
		translation DepotCode de="Depot "
		translation DepotTwin de="DepotTwin"
		translation Dienste de="Dienste"
		translation EDossierStarten de="eDossier starten"
		translation ESC de="Ende               ESC"
		translation Emissionsabgabe de="Emissionsabgabe"
		translation EndeESC de="Ende                                   ESC"
		translation ExitMenu de="&Beenden"
		translation ExportToExcelDiagramMenu de="Ausgabe in Excel &Diagramm"
		translation ExportToExcelMenu de="Ausgabe in &Excel"
		translation FiT de="FiT"
		translation FileMenu de="&Datei"
		translation Finanzieren de="Finanzieren"
		translation FondsSparplan de="Fonds-Sparplan"
		translation Funktionen de="Funktionen "
		translation GesamtobligoEN de="Gesamtobligo"
		translation HelpMenu de="&Hilfe"
		translation IndexHilfe de="Index Hilfe"
		translation Info de="Info"
		translation InfoF7 de="Info                                     F7"
		translation InfoUmschF7 de="Info (Umsch + F7)"
		translation Inhaber de="Inhaber"
		translation KOEmission de="KO Emission"
		translation KOEmissionMenu de="KO Emission..."
		translation KOEmmissionTc200 de="200 KO Emission"
		translation Kassenobligationen de="Kassenobligationen"
		translation KassenobligationenArt de="Kassenobligationen Art"
		translation KontoIBAN de="Konto / IBAN"
		translation Kontobelastung de="Kontobelastung"
		translation Kreditkarte de="Kreditkarte"
		translation Kunde de="Kunde"
		translation Kurzbezeichnung de="Kurzbezeichnung"
		translation LaufzeitText de="Laufzeit"
		translation MitTiteldruck de="Mit Titeldruck"
		translation Namen de="Namen"
		translation NamenMitglied de="Namen Mitglied"
		translation ObligoF5 de="Obligo                                F5"
		translation ProgrammSuchenUmschF2EN de="Programm suchen (Umsch + F2)"
		translation RAIweb de="RAIweb"
		translation RIAG de="RIAG"
		translation RaiffeisenEBanking de="Raiffeisen E-Banking"
		translation Schnellzugriff de="Schnellzugriff..."
		translation SchnellzugriffForm de="Schnellzugriff"
		translation SpezialzinsF2 de="Spezialzins                         F2"
		translation StornoF6 de="Storno                                F6"
		translation TC0 de="TC ..."
		translation TC de="TC"
		translation TCButton de="..."
		translation Test de="Test"
		translation TestForm de="TestForm"
		translation ToolsMenu de="&Extras"
		translation TransactionsCodeForKOEmission de="200 KO Emission"
		translation Transaktionscode de="TC"
		translation TransaktionscodeTwin de="TransaktionscodeTwin"
		translation UKVKF3 de="UK/VK                                 F3"
		translation UKVollmachtenkarte de="UK / Vollmachtenkarte"
		translation Valorennummer de="Valorennummer"
		translation Versicherung de="Versicherung"
		translation Vorsorgen de="Vorsorgen"
		translation Zahlen de="Zahlen"
		translation Zentralregister de="Zentralregister"
		translation ZentralregisterUmschF12 de="Zentralregister (Umsch + F12) "
		translation ZinssatzText de="Zinssatz"
		translation ZinstermAuslauf de="Zinsterm / Auslauf"
		translation ZregNumber de="ZREG-Nr."
		translation ZregQuickSearchForm de="Zreg Schnellsuche"
		translation anErrorOccured de="Ein Fehler ist aufgetreten"
		translation loggingFileNotFound de="Das Logging wurde nicht korrekt inizilisiert. Bitte Kevin kontaktieren..."
		translation loggingMalformedUrl de="Das Logging wurde nicht korrekt inizilisiert. Bitte Kevin kontaktieren..."
		translation someErrorsOccured de="Folgende Fehler sind aufgetreten"
		
		
		// ========================
		// CODE TYPES
		// ========================
		code KOArt id="Integer.valueOf(1112)"
		code KOLaufzeit id="Integer.valueOf(9687)"
		code KOTiteldruck id="Integer.valueOf(2569)"
		
		
		// ========================
		// LOOKUP CALLS & SERVICES
		// ========================
		lookup DepotNumber {
			logic placement=server {
				"private LookupRow[] createDummyData() {
		  		  return new LookupRow[]{new LookupRow(new DepotId(), \"Depot id 1\"), new LookupRow(new DepotId(), \"Depot id 2\"), new LookupRow(new DepotId(), \"Depot id 3\")};
		  		}"
		    }
			logic event=all placement=server {
				"return createDummyData();"
			}
		}
		
		lookup OldObliNumber {
			logic event=all placement=server {
				"return new LookupRow[]{
				new org.eclipse.scout.rt.shared.services.lookup.LookupRow(1L, \"Value 1\"),
				new org.eclipse.scout.rt.shared.services.lookup.LookupRow(2L, \"Value 2\"),
				new org.eclipse.scout.rt.shared.services.lookup.LookupRow(3L, \"Value 3\")};
				"
			}
		}
		
		lookup KontoByZrnr {
			logic placement=server { 
				"private LookupRow[] createDummyData() {
		  		  return new LookupRow[]{new LookupRow(new KontoData(), \"KontoData id 1\"), new LookupRow(new KontoData(), \"KontoData id 2\"), new LookupRow(new KontoData(), \"KontoData id 3\")};
		  		}"
		  	}
			logic event=all placement=server {
				"return createDummyData();"
			}
		}
		
		// ========================
		// UI TEMPLATE DEFINITIONS
		// ========================
		template zreg_sequence definition="java.lang.Integer"
		
		
		// ========================
		// FORMS
		// ========================
		form Rka001_gen modal=true title=KOEmission subtitle=DIALBA2020 {
			logic EvalForm placement=client {
				"evaluateZinstermFields();
			     evaluateBuchungstext1And2();"
			}
			
			logic ZregAsMasterField placement=inline {
				"@Override
		        protected Class<? extends IValueField> getConfiguredMasterField() {
		            return getZregBoxField().getZregNumberField().getClass();
		        }
		
		        @Override
		        protected boolean getConfiguredMasterRequired() {
		            return true;
		        }"
			}
			
			logic placement=server event=new_store {
				"System.out.println(\"server call create\");
				 return formData;"
			}
			
			logic placement=client {
				"private void evaluateBuchungstext1And2() throws ProcessingException {
			        System.out.println(\"client method evaluateBuchungstext1And2\");	
				}
			
				private void evaluateZinstermFields() {
			        System.out.println(\"client method evaluateZinstermFields\");
			    }"
			}
			
			group Tool label_visible=false border_decoration=empty border_visible=false {
				button FunktionenButton text=Funktionen process_button=false {
					menu EndeESCMenu text=EndeESC
					menu SpezialzinsF2Menu text=SpezialzinsF2
					menu UKVKF3Menu text=UKVKF3
					menu BemF4Menu text=BemF4
					menu ObligoF5Menu text=ObligoF5
					menu StornoF6Menu text=StornoF6
					menu InfoF7Menu text=InfoF7
				}
			}
		
			sequence TransaktionscodeSequence {
				string BuchungsCode text=Transaktionscode enabled=false {
					logic placement=inline event=format_value {
						"return TEXTS.get(\"TransactionsCodeForKOEmission\");"
					}
				}
			}
			
			custom_field ZregBox super_type=zreg_sequence text=Zentralregister {
				logic event=init placement=client {
					"System.out.println(\"init zregboxfield\");"
				}
				logic placement=inline {
					"@Override
		            public ch.raiffeisen.dialba.common.shared.services.process.ZregSequenceBoxDataAbs getBoxData() {
		                return new Rka001_genFormData().getZregBox();
		            }"
				}
			}
		
			sequence KoArtSequence {
				smartfield KoArt text=Art mandatory=true value_type="java.lang.Integer" code=KOArt
			}
			
			sequence LaufzeitSequence {
				smartfield Laufzeit text=LaufzeitText mandatory=true code=KOLaufzeit value_type="java.lang.Integer" {
					logic event=changed placement=server {
						"System.out.println(\"server call LaufzeitfieldChanged\");
						 return formData;"
					}
					logic event=changed exec=EvalForm
				}
			}
		
			sequence ValorSequence {
				string Valor text=Valorennummer enabled=false
			}
			
			sequence ZinssatzSequence {
				bigdecimal Zinssatz text=ZinssatzText enabled=false
			}
		
			sequence MitTiteldruckSequence {
				smartfield MitTitel text=MitTiteldruck mandatory=true code=KOTiteldruck value_type="java.lang.Integer" {
					logic event=changed placement=server {
						"System.out.println(\"server call MitTitelFieldChanged\");
						 return formData;"
					}
					logic event=changed placement=client {
						"evaluateBuchungstext1And2();"
					}
				}
			}
			
			sequence DepotSequence {
				smartfield Depot text=DepotText lookup=DepotNumber value_type="java.lang.Double" {
					logic exec=ZregAsMasterField
				}
			}
		
			sequence AlteNeueKONrSequence {
				smartfield ObligationNrAlt text=AlteNeueKONr mandatory=true lookup=OldObliNumber value_type="java.lang.Integer" {
					logic exec=ZregAsMasterField
				}
				long ObligationNr enabled=false label_visible=false
			}
		  
			sequence DatumEmissionSequence {
				date BuchungsDatum text=DatumEmission enabled=false {
					logic event=init placement=client {
						"form.getBuchungsDatumField().setValue(new java.util.Date());"
					}
				}
		    	date EmissionsDatum mandatory=true label_visible=false {
		    		logic event=init placement=client {
						"form.getEmissionsDatumField().setValue(new java.util.Date());"
					}
					logic event=changed placement=server {
						"System.out.println(\"server call EmissionsDatumFieldChanged\");
						 return formData;"
					}
		    	}
			}
		
			sequence ZinstermAuslaufSequence {
				string Zinsterm text=ZinstermAuslauf enabled=false
				string EndJahr enabled=false label_visible=false
			}
		  
			sequence BetragSpesenSequence {
				long Betrag text=BetragSpesen mandatory=true {
					logic event=changed placement=client {
						"form.getEmissionField().setValue(0d);"
					}
				}
				string BetragsWaehrung enabled=false label_visible=false {
					logic placement=inline event=format_value {
						"return TEXTS.get(\"CHF\");"
					}
				}
			}
		  
			sequence EmissionsabgabeSequence {
				bigdecimal Emission text=Emissionsabgabe enabled=false
				string EmissionsWaehrung enabled=false label_visible=false {
					logic placement=inline event=format_value {
						"return TEXTS.get(\"CHF\");"
					}
				}
			}
		  
		  	sequence KontobelastungSequence {
				smartfield KontoNr text=Kontobelastung mandatory=true lookup=KontoByZrnr value_type="java.util.List" {
					logic exec=ZregAsMasterField
					logic event=changed placement=client {
						"KontoData kontoData = form.getKontoNrField().getValue();
					    if (kontoData != null) {
					      form.getZregKurzbezeichnungField().setValue(kontoData.getZregKurzBez());
					      form.getKontostandField().setValue(kontoData.getSaldo());
					    }"
					}
				}
				string ZregKurzbezeichnung enabled=false label_visible=false master=KontoNr 
				string Kontostand enabled=false label_visible=false
			}
		
			sequence Buchungstext1Sequence {
				string KontoText1 text=Buchungstext1 enabled=false
			}
		  
			sequence Buchungstext2Sequence {
				string KontoText2 text=Buchungstext2 enabled=false
			}
		  
			sequence Buchungstext3Sequence {
				string KontoText3 text=Buchungstext3
			}
		} // end form Rka001
		'''.parse(resourceSet).assertNoErrors

		'''
		module ch.raiffeisen.dialba.common
		
		translation BuDatum de="Bu-Datum"
		translation Text de="Text"
		translation Valuta de="Valuta"
		translation Sy de="Sy"
		translation CpNr de="Cp.-Nr."
		translation SollHaben de="Soll/Haben"
		translation Saldo de="Saldo"
		
		form Rka021_gen {
			logic event=modify_load placement=server {
				"System.out.println(\"Rka021 form startup\");
				formData.getStornoTable().addRow(new Object[]{new Date(), \"text\", new Date(), 15, 134592, \"sollhaben text\", 135.25});
				return formData;"
			}
			group NumberTest {
				bigdecimal MyBigDecimal min=12.0 max=200.0 percent=false grouping=true fraction_digits=3
				long MyLong min=0 max=100 width_pixels=80 horizontal_align=center
			}
			group HeightTest height=10 {
				string TextArea height=5
			}
			table StornoTable label_visible=false height=10 width=2 {
				menu InfoF7Menu text=InfoF7
				
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