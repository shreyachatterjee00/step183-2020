// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.sps.servlets;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Customized implementation to be used for unit testing. Removes the language API dependency so
 * that the doGet method can be tested in isolation.
 */
public class TestGuessServlet extends GuessServlet {
  @Override
  ArrayList<String> findEntities(String word) throws IOException {
    ArrayList<String> entities = new ArrayList<String>();
    String[] arr = word.toLowerCase().split(" ");
    for (String i : arr) {
      entities.add(i);
    }
    return entities;
  }
}
