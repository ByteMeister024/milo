/*
 * Copyright (c) 2019 the Eclipse Milo Authors
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */

package org.eclipse.milo.opcua.sdk.server.model.nodes.objects;

import java.util.Optional;

import org.eclipse.milo.opcua.sdk.core.nodes.VariableNode;
import org.eclipse.milo.opcua.sdk.server.model.nodes.variables.PropertyTypeNode;
import org.eclipse.milo.opcua.sdk.server.model.types.objects.AuditCancelEventType;
import org.eclipse.milo.opcua.sdk.server.nodes.UaNodeContext;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UByte;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UInteger;

public class AuditCancelEventTypeNode extends AuditSessionEventTypeNode implements AuditCancelEventType {
    public AuditCancelEventTypeNode(UaNodeContext context, NodeId nodeId, QualifiedName browseName,
                                    LocalizedText displayName, LocalizedText description, UInteger writeMask,
                                    UInteger userWriteMask) {
        super(context, nodeId, browseName, displayName, description, writeMask, userWriteMask);
    }

    public AuditCancelEventTypeNode(UaNodeContext context, NodeId nodeId, QualifiedName browseName,
                                    LocalizedText displayName, LocalizedText description, UInteger writeMask,
                                    UInteger userWriteMask, UByte eventNotifier) {
        super(context, nodeId, browseName, displayName, description, writeMask, userWriteMask, eventNotifier);
    }

    @Override
    public PropertyTypeNode getRequestHandleNode() {
        Optional<VariableNode> propertyNode = getPropertyNode(AuditCancelEventType.REQUEST_HANDLE);
        return (PropertyTypeNode) propertyNode.orElse(null);
    }

    @Override
    public UInteger getRequestHandle() {
        Optional<UInteger> propertyValue = getProperty(AuditCancelEventType.REQUEST_HANDLE);
        return propertyValue.orElse(null);
    }

    @Override
    public void setRequestHandle(UInteger value) {
        setProperty(AuditCancelEventType.REQUEST_HANDLE, value);
    }
}
