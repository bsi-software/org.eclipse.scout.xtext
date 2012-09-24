
package org.eclipse.scout.saml;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SamlStandaloneSetup extends SamlStandaloneSetupGenerated{

	public static void doSetup() {
		new SamlStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

