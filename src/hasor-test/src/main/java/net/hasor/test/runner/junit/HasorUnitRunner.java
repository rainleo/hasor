/*
 * Copyright 2008-2009 the original 赵永春(zyc@hasor.net).
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
package net.hasor.test.runner.junit;
import net.hasor.test.script.Hi;
import org.junit.runner.JUnitCore;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;
/**
 * 
 * @version : 2014年7月8日
 * @author 赵永春(zyc@hasor.net)
 */
public class HasorUnitRunner extends BlockJUnit4ClassRunner {
    public HasorUnitRunner(Class<?> klass) throws InitializationError {
        super(klass);
    }
    public static void main(String[] args) {
        JUnitCore.runClasses(Hi.class);
    }
}