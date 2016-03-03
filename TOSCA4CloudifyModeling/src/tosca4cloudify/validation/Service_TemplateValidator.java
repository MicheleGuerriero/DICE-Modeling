/**
 *
 * $Id$
 */
package tosca4cloudify.validation;

import org.eclipse.emf.common.util.EList;

import tosca4cloudify.Import;
import tosca4cloudify.Input;
import tosca4cloudify.Node_template;
import tosca4cloudify.Output;

/**
 * A sample validator interface for {@link tosca4cloudify.Service_Template}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface Service_TemplateValidator {
    boolean validate();

    boolean validateTosca_definition_version(String value);
    boolean validateDescription(String value);
    boolean validateServiceTemplate_hasImport(EList<Import> value);
    boolean validateServiceTemplate_hasOutput(EList<Output> value);
    boolean validateInterface_hasInput(EList<Input> value);
    boolean validateService_hasNodeTemplate(EList<Node_template> value);
}
