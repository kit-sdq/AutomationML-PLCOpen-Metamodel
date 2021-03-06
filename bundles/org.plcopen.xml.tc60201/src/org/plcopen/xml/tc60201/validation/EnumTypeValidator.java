/**
 *
 * $Id$
 */
package org.plcopen.xml.tc60201.validation;

import org.plcopen.xml.tc60201.DataType;
import org.plcopen.xml.tc60201.ValuesType;

/**
 * A sample validator interface for {@link org.plcopen.xml.tc60201.EnumType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EnumTypeValidator {
	boolean validate();

	boolean validateValues(ValuesType value);
	boolean validateBaseType(DataType value);
}
