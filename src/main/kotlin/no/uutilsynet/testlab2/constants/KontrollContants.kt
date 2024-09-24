package no.uutilsynet.testlab2.constants

import com.fasterxml.jackson.annotation.JsonProperty

enum class Kontrolltype {
  @JsonProperty("inngaaende-kontroll") InngaaendeKontroll,
  @JsonProperty("forenkla-kontroll") ForenklaKontroll,
  @JsonProperty("tilsyn") Tilsyn,
  @JsonProperty("statusmaaling") Statusmaaling,
  @JsonProperty("uttalesak") Uttalesak,
}

enum class Sakstype {
  @JsonProperty("forvaltningssak") Forvaltningssak,
  @JsonProperty("arkivsak") Arkivsak
}
