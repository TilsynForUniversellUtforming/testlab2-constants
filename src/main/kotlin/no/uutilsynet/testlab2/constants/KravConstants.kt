package no.uutilsynet.testlab2.constants

enum class WcagSamsvarsnivaa(val nivaa: String) {
  A("A"),
  AA("AA"),
  AAA("AAA")
}

enum class WcagRetninglinje(val retninglinje: String) {
  tekst_alternativ("1.1 Tekstalternativer"),
  tidsbasert_media("1.2 Tidsbasert media"),
  mulig_aa_tilpasse("1.3 Mulig å tilpasse"),
  mulig_aa_skille_fra_hverandre("1.4 Mulig å skille fra hverandre"),
  tilgjengelig_med_testatur("2.1 Tilgjengelig med tastatur"),
  nok_tid("2.2 Nok tid"),
  anfall("2.3 Anfall"),
  navigerbar("2.4 Navigerbar"),
  inndata_modalitet("2.5 Inndata modalitet"),
  leselig("3.1 Leselig"),
  forutsigbar("3.2 Forutsigbar"),
  inndatahjelp("3.3 Inndatahjelp"),
  kompatibel("4.1 Kompatibel"),
}

enum class WcagPrinsipp(val prinsipp: String) {
  mulig_aa_oppfatte("1. Mulig å oppfatte"),
  mulig_aa_betjene("2. Mulig å betjene"),
  forstaelig("3. Forståelig"),
  robust("4. Robust")
}

enum class KravStatus {
  Nytt,
  Gjeldande,
  Utgått
}
