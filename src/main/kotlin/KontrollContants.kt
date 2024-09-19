enum class Kontrolltype(val kontrolltype: String) {
  InngaaendeKontroll("inngaaende-kontroll"),
  ForenklaKontroll("forenkla-kontroll"),
  Tilsyn("tilsyn"),
  Statusmaaling("statusmaaling"),
  Uttalesak("uttalesak")
}

enum class Sakstype(val sakstype: String) {
  Forvaltningssak("forvaltningssak"),
  Arkiv("arkivsak")
}
