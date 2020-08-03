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

import com.google.gson.Gson;
import java.util.HashSet;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Servlet that returns bucket list content */
@WebServlet("/generate")
public class generateServlet extends HttpServlet {

  private static final String FILTER_ARRAY = "clicked-array";
  String JSONclickedArray;
  HashSet<String> clickedFilters;

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    // Get array of clicked filters and convert to ArrayList<String>
    JSONclickedArray = request.getParameter(FILTER_ARRAY);
    Gson gson = new Gson();
    clickedFilters = gson.fromJson(JSONclickedArray, HashSet.class);

    response.setContentType("text/html;");
    response.getWriter().println(clickedFilters);
    response.sendRedirect("/index.html");
  }
}
