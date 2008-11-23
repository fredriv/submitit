package no.java.submitit.model

class Presentation(val title: String, 
                   val speakers: List[Speaker], 
                   val `abstract`: String, 
                   val outline: String, 
                   val description: String, 
                   val language: Language,
                   val level: Level,
                   val duration: Int,
                   val equipment: String,
                   val requiredExperience: String,
                   val expectedAudience: String) {

}
