/*
* generated by Xtext
*/
package org.eclipse.viatra.cep.vepl.ui.labeling

import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.viatra.cep.vepl.vepl.AtomicEventPattern
import org.eclipse.viatra.cep.vepl.vepl.ComplexEventPattern
import org.eclipse.viatra.cep.vepl.vepl.EventModel
import org.eclipse.viatra.cep.vepl.vepl.Import
import org.eclipse.viatra.cep.vepl.vepl.QueryResultChangeEventPattern
import org.eclipse.viatra.cep.vepl.vepl.Rule
import org.eclipse.xtext.xbase.ui.labeling.XbaseLabelProvider

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class VeplLabelProvider extends XbaseLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	// Labels and icons can be computed like this:
	//	def text(Greeting ele) {
	//		'A greeting to ' + ele.name
	//	}
	//
	//	def image(Greeting ele) {
	//		'Greeting.gif'
	//	}
	override image(Object element) {

		// icons are stored in the 'icons' folder of this project
		switch element {
			EventModel:
				'package.gif'
			AtomicEventPattern:
				'atomic-event.png'
			ComplexEventPattern:
				'complex-event.png'
			QueryResultChangeEventPattern:
				'model-query.png'
			Rule:
				'rule.png'
			Import:
				'import-declaration.png'
			default:
				super.image(element)
		}
	}
}
