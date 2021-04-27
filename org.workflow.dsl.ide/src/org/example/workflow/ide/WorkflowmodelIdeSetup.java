/*
 * generated by Xtext 2.24.0
 */
package org.example.workflow.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.example.workflow.WorkflowmodelRuntimeModule;
import org.example.workflow.WorkflowmodelStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class WorkflowmodelIdeSetup extends WorkflowmodelStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new WorkflowmodelRuntimeModule(), new WorkflowmodelIdeModule()));
	}
	
}
