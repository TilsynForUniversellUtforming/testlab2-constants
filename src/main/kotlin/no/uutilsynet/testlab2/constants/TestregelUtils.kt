package no.uutilsynet.testlab2.constants

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(
    JsonSubTypes.Type(value = StringTestregelDefinition::class, name = "string"),
    JsonSubTypes.Type(value = QualwebTestregelDefinition::class, name = "qualweb"),
    JsonSubTypes.Type(value = ManuellForenklaTestregelDefinition::class, name = "manuell-forenkla"))
interface ITestregelDefinition

class StringTestregelDefinition(val body: String) : ITestregelDefinition

class QualwebTestregelDefinition(val key: String) : ITestregelDefinition

class ManuellForenklaTestregelDefinition(
    val description: String,
    val utfall: List<TestregelUtfall>
) : ITestregelDefinition

data class TestregelUtfall(
    val id: Int?,
    val beskrivelse: String,
    val testresultat: TestresultatUtfall,
    val default: Boolean = false
)
