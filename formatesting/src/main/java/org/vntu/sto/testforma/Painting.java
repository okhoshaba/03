package org.vntu.sto.testforma;

class Painting extends Shop {
  private String paintColor;

  public String getPaintColor() {
    return " PaintColor: " + paintColor;
  }

  public void setPaintColor(String paintColor) {
    this.paintColor = paintColor;
  }
}

