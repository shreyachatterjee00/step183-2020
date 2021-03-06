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

package com.google.sps.data;

// Represents a destination to be added to a scavenger hunt.
public class HuntItem {
  private String name;
  // Temporarily represented as a String, for simplicity.
  private LatLng location;
  private String description;
  private Riddle riddle;
  private String placeId;

  private HuntItem() {}

  public String getName() {
    return this.name;
  }

  public static class Builder {
    private String name;
    private LatLng location;
    private String description;
    private Riddle riddle;
    private String placeId;

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder atLocation(LatLng location) {
      this.location = location;
      return this;
    }

    public Builder withDescription(String description) {
      this.description = description;
      return this;
    }

    public Builder withRiddle(Riddle riddle) {
      this.riddle = riddle;
      return this;
    }

    public Builder withPlaceId(String placeId) {
      this.placeId = placeId;
      return this;
    }

    public HuntItem build() {
      HuntItem item = new HuntItem();
      item.name = this.name;
      item.location = this.location;
      item.description = this.description;
      item.riddle = this.riddle;
      item.placeId = this.placeId;

      return item;
    }
  }
}
