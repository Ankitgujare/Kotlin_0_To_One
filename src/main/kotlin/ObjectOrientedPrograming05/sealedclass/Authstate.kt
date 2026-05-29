package ObjectOrientedPrograming05.sealedclass

sealed class Authstate {
        data class Login(val username:String,val password:String)
            :Authstate()

        object Logout:Authstate()
        object Loading:Authstate()

        data class Error(val error:String):Authstate()
}