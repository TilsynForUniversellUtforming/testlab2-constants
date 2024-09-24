package no.uutilsynet.testlab2.constants

import com.fasterxml.jackson.annotation.JsonProperty

enum class StyringsdataType {
  kontroll,
  loeysing,
}

enum class Klagetype {
  paalegg,
  bot
}

enum class Reaksjonstype {
  @JsonProperty("reaksjon") reaksjon,
  @JsonProperty("ingen-reaksjon") ingenReaksjon
}

enum class StyringsdataKontrollStatus {
  @JsonProperty("planlagt") planlagt,
  @JsonProperty("paagar") paagar,
  @JsonProperty("avslutta") avslutta,
  @JsonProperty("ikkje-aktuell") ikkjeAktuell,
  @JsonProperty("forsinka") forsinka,
}

enum class BotOekningType {
  @JsonProperty("kroner") kroner,
  @JsonProperty("prosent") prosent,
  @JsonProperty("ikkje-relevant") ikkjeRelevant
}

enum class ResultatKlage {
  @JsonProperty("stadfesta") stadfesta,
  @JsonProperty("delvis-omgjort") delvisOmgjort,
  @JsonProperty("omgjort") omgjort,
  @JsonProperty("oppheva") oppheva,
}
