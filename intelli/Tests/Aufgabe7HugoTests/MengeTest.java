package Aufgabe7HugoTests;

import Aufgabe7Hugo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MengeTest {

  @Test
  public void testeEinfuegen() {
    Menge menge1 = new Menge();


    menge1.einfuegen("1");
    menge1.einfuegen("2");
    menge1.einfuegen("3");
    assertEquals(3, menge1.getAnzElemente());
    menge1.einfuegen("3");
    assertEquals(3, menge1.getAnzElemente());

    assertTrue(menge1.beinhaltet("1"));
    assertTrue(menge1.beinhaltet("2"));
    assertTrue(menge1.beinhaltet("3"));
  }

  @Test
  public void testeSchnitt(){
    Menge menge1 = new Menge();
    Menge menge2 = new Menge();

    menge1.einfuegen("1");
    menge1.einfuegen("2");

    menge2.einfuegen("1");
    menge2.einfuegen("3");
    menge2.einfuegen("4");

    Menge schnitt = menge1.schnitt(menge2);
    assertEquals(1, menge1.getAnzElemente());
    assertFalse(schnitt.beinhaltet("2"));
    assertFalse(schnitt.beinhaltet("3"));
    assertFalse(schnitt.beinhaltet("4"));
    assertTrue(schnitt.beinhaltet("1"));
  }

}
