/*
 * generated by Xtext 2.24.0
 */
package org.example.workflow.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.workflow.dsl.ui.internal.DslActivator;

public class WorkflowmodelUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DslActivator.getInstance().getInjector("org.example.workflow.Workflowmodel");
	}

}
