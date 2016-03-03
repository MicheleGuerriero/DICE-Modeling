/**
 *
 * $Id$
 */
package tosca4cloudify.validation;

import org.eclipse.emf.common.util.EList;

import tosca4cloudify.Attribute;
import tosca4cloudify.Interface;
import tosca4cloudify.Property;
import tosca4cloudify.Relationship;
import tosca4cloudify.Requirement;
import tosca4cloudify.instance;

/**
 * A sample validator interface for {@link tosca4cloudify.Node_template}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface Node_templateValidator {
    boolean validate();

    boolean validateNode_template_name(String value);
    boolean validateType(String value);
    boolean validateNodeTemplate_hasInterface(EList<Interface> value);
    boolean validateDescription(String value);
    boolean validateNodeTemplate_hasProperty(EList<Property> value);
    boolean validateNodeTemplate_hasAttribute(EList<Attribute> value);
    boolean validateNodeTemplate_hasRequirement(EList<Requirement> value);
    boolean validateNodeTemplate_hasRelationship(EList<Relationship> value);
    boolean validateNodeTemplate_hasInstances(instance value);
}