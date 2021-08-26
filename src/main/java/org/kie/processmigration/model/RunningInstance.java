/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kie.processmigration.model;

import java.time.Instant;

import org.kie.server.api.model.instance.ProcessInstance;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@EqualsAndHashCode
@ToString
@Accessors(chain = true)
@Getter
@Setter
public class RunningInstance {

    private int id;
    private Long processInstanceId;
    private String name;
    private String description;
    private Integer state;
    private Instant startTime;

    public RunningInstance(int i, ProcessInstance p) {
        id = i;
        processInstanceId = p.getId();
        name = p.getProcessName();
        description = p.getProcessInstanceDescription();
        state = p.getState();
        startTime = p.getDate().toInstant();
    }

}
