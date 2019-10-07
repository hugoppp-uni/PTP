/*• Zeichnen Sie drei verschiedene Rechtecke an
verschiedenen Positionen im Fenster mit unterschiedlichen
Füllfarben und unterschiedlichen
Linienfarben.
• Zeichnen Sie drei ineinander geschachtelte
Kreise mit dem gleichen Mittelpunkt und unterschiedlichen
Radien.
• Zeichnen Sie unter Verwendung des line()-
Befehls ein Dreieck. Die Größe des Dreiecks
soll durch eine Variable skalierung einstellbar
sein. */

size(1000, 1000);
for (int i=1; i<=3; i++) {
  fill(i*50, 0, 255);
  stroke(i*50, 0 ,255);
  rect(i*50, i*50, i*50, i*50);
}

  
