package no.uutilsynet.testlab2.constants

enum class TestresultatUtfall {
  samsvar,
  brot,
  ikkjeForekomst,
  varsel,
  ikkjeTesta
}

enum class TestregelModus(val value: String) {
  automatisk("automatisk"),
  semiAutomatisk("semi-automatisk"),
  manuell("manuell"),
  forenklet("forenklet"),
  deque("deque"),
  manuellForenkla("manuell-forenkla"),
}

enum class TestregelInnholdstype(val value: String) {
  app("app"),
  automat("automat"),
  dokument("dokument"),
  nett("nett"),
}

enum class TestregelStatus(val value: String) {
  ikkje_starta("ikkje_starta"),
  under_arbeid("under_arbeid"),
  gjennomgaatt_workshop("gjennomgaatt_workshop"),
  klar_for_testing("klar_for_testing"),
  treng_avklaring("treng_avklaring"),
  ferdig_testa("ferdig_testa"),
  klar_for_kvalitetssikring("klar_for_kvalitetssikring"),
  publisert("publisert"),
  utgaar("utgaar"),
}

enum class TestgrunnlagType {
  OPPRINNELEG_TEST,
  RETEST
}
