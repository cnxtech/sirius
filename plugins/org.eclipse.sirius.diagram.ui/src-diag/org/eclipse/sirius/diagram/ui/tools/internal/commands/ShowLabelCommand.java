/*******************************************************************************
 * Copyright (c) 2009 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.sirius.diagram.ui.tools.internal.commands;

import org.eclipse.sirius.diagram.ui.tools.internal.actions.visibility.RevealOutlineLabelsAction;
import org.eclipse.sirius.ui.tools.internal.commands.AbstractActionWrapperHandler;

/**
 * A command to show the label of a DNode.
 * 
 * @author lredor
 */
public class ShowLabelCommand extends AbstractActionWrapperHandler {

    /**
     * Construct a new instance.
     */
    public ShowLabelCommand() {
        super(new RevealOutlineLabelsAction());
    }

}
