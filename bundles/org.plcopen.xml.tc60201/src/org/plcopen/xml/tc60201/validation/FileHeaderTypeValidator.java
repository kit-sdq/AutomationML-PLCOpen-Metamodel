/**
 *
 * $Id$
 */
package org.plcopen.xml.tc60201.validation;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * A sample validator interface for {@link org.plcopen.xml.tc60201.FileHeaderType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FileHeaderTypeValidator {
	boolean validate();

	boolean validateCompanyName(String value);
	boolean validateCompanyURL(String value);
	boolean validateContentDescription(String value);
	boolean validateCreationDateTime(XMLGregorianCalendar value);
	boolean validateProductName(String value);
	boolean validateProductRelease(String value);
	boolean validateProductVersion(String value);
}
