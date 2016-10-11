/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.hasor.neuron._;
/**
 * 结果集
 * @version : 2016年09月10日
 * @author 赵永春(zyc@hasor.net)
 */
public class PaxosResultDO<T> implements PaxosResult<T> {
    private static final long serialVersionUID = -4678893554960623786L;
    private ResultTypeEnum resultType;
    private T              result;
    //
    public PaxosResultDO(ResultTypeEnum resultType) {
        this.resultType = resultType;
    }
    //
    @Override
    public T getResult() {
        return this.result;
    }
    public void setResult(T result) {
        this.result = result;
    }
    @Override
    public ResultTypeEnum getResultType() {
        return this.resultType;
    }
}