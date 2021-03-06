/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.profiler.ppoints.ui;

import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import org.openide.util.actions.SystemAction;
import java.awt.event.ActionEvent;
import org.netbeans.modules.profiler.api.icons.Icons;


/**
 * Opens the Profiling Points view.
 *
 * @author Maros Sandor
 */
public class OpenProfilingPointsWindowAction extends SystemAction {
    //~ Constructors -------------------------------------------------------------------------------------------------------------

    public OpenProfilingPointsWindowAction() {
        putValue("noIconInMenu", null); // NOI18N
        setIcon(Icons.getIcon(ProfilingPointsIcons.PPOINT));
    }

    //~ Methods ------------------------------------------------------------------------------------------------------------------

    public HelpCtx getHelpCtx() {
        return new HelpCtx(OpenProfilingPointsWindowAction.class);
    }

    @NbBundle.Messages("OpenProfilingPointsWindowAction_ActionName=&Profiling Points")
    public String getName() {
        return Bundle.OpenProfilingPointsWindowAction_ActionName();
    }

    public void actionPerformed(ActionEvent e) {
        ProfilingPointsWindow stc = ProfilingPointsWindow.getDefault();
        stc.open();
        stc.requestActive();
    }
}
