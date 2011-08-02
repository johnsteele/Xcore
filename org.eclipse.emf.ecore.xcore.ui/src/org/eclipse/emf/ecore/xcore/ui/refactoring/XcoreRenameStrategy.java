
/*
* generated by Xtext
*/
package org.eclipse.emf.ecore.xcore.ui.refactoring;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.ui.refactoring.IRenameStrategy;
import org.eclipse.xtext.ui.refactoring.impl.DefaultRenameStrategy;
import org.eclipse.xtext.ui.refactoring.ui.IRenameElementContext;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.ui.jvmmodel.refactoring.AbstractJvmModelRenameStrategy;

import com.google.inject.Inject;

/**
 * Encapsulates the model changes of a rename refactoring.  
 */
public class XcoreRenameStrategy extends AbstractJvmModelRenameStrategy {

	public static class Provider extends DefaultRenameStrategy.Provider {

		@Inject
		private IJvmModelAssociations jvmModelAssociations;

		@Override
		public IRenameStrategy get(EObject targetElement, IRenameElementContext renameElementContext) {
			return new XcoreRenameStrategy(targetElement, getLocationInFileProvider(), jvmModelAssociations);
		}
	}
	
	protected XcoreRenameStrategy(EObject targetElement, ILocationInFileProvider locationInFileProvider,
			IJvmModelAssociations jvmModelAssociations) {
		super(targetElement, locationInFileProvider, jvmModelAssociations);
	}

	@Override
	protected void setInferredJvmElementName(String name, EObject renamedSourceElement) {
		/*
		 * TODO: rename inferred elements as you would in IJvmModelInferrer 
		 */
	}
}
