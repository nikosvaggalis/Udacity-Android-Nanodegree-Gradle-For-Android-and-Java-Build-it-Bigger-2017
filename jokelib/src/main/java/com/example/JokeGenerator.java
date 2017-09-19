/*
 *
 *  * Copyright 2017 Nikos Vaggalis
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.example;

import java.util.List;
import java.util.Random;
import static java.util.Arrays.asList;

public class JokeGenerator {

    List<String> alltheJokes =  asList("joke1", "joke2", "joke3","joke4","joke5");

    public  String getJoke() {
        int randomInt= new Random().nextInt(4);
        return alltheJokes.get(randomInt);
    }

}
