package ObjectOrientedPrograming05.sealedclass

sealed class DownloadState {

    object downloadstarted:DownloadState()
    data class downloading(val progress:String):DownloadState()
    data class Finished(val path:String):DownloadState()
    data class downloadFailed(val reason:String)

}