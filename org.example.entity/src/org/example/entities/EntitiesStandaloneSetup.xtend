/*
 * generated by Xtext 2.24.0
 */
package org.example.entities


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class EntitiesStandaloneSetup extends EntitiesStandaloneSetupGenerated {

	def static void doSetup() {
		new EntitiesStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
