/*******************************************************************************
 * Copyright (c) 2009, 2015 THALES GLOBAL SERVICES and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.sirius.diagram.editor.tools.internal.menu.child;

import org.eclipse.sirius.diagram.description.concern.ConcernPackage;
import org.eclipse.sirius.diagram.description.filter.FilterPackage;
import org.eclipse.sirius.editor.tools.api.menu.AbstractMenuBuilder;
import org.eclipse.sirius.editor.tools.api.menu.AbstractTypeRestrictingMenuBuilder;

/**
 * The filters menu.
 * 
 * @author cbrun
 * 
 */
public class FiltersMenuBuilder extends AbstractTypeRestrictingMenuBuilder {
    /**
     * Build the menu.
     */
    public FiltersMenuBuilder() {
        super();
        addValidType(FilterPackage.eINSTANCE.getFilterDescription());
        addValidType(ConcernPackage.eINSTANCE.getConcernSet());
    }

    @Override
    public String getLabel() {
        return "New Filter";
    }

    @Override
    public int getPriority() {
        return AbstractMenuBuilder.FILTER;
    }
}
