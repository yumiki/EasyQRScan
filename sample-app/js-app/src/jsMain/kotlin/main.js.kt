import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.CanvasBasedWindow
import androidx.compose.ui.ExperimentalComposeUiApi
import org.jetbrains.skiko.wasm.onWasmReady
import org.publicvalue.multiplatform.qrcode.sample.MainView

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    onWasmReady {
        CanvasBasedWindow(title = "EasyQRScan") {
            Column(modifier = Modifier.fillMaxSize()) {
                MainView()
            }
        }
    }
}