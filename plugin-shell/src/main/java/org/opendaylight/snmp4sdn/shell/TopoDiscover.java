/**
 * Copyright (c) 2014 Industrial Technology Research Institute of Taiwan. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.snmp4sdn.shell;

import org.apache.felix.gogo.commands.Argument;
import org.apache.felix.gogo.commands.Command;
import org.apache.karaf.shell.console.OsgiCommandSupport;
import org.opendaylight.snmp4sdn.ICore;

@Command(scope = "snmp4sdn", name = "TopoDiscover", description="Topology Discovery for Inventory and Edge, i.e. execute the two commands 'TopoDiscoverSwitches' and 'TopoDiscoverEdges' (collect switches, ports, and edges among switches)")
public class TopoDiscover extends OsgiCommandSupport{
    private ICore controller;

    @Override
    protected Object doExecute() throws Exception {
        controller.topoDiscover();
        return null;
    }

    public void setController(ICore controller){
        this.controller = controller;
    }
}
