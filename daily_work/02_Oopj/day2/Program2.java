import java.io.IOException;

public class Program2  {
    public static void main(String[] args)throws IOException {
        System.out.println("Hello, Enter something ...");
        System.in.read();
    }
}


// Java is multithreaded language

// to see pid     : jcmd
// to see threads : jstack




//
// PS D:\CDAC\pgdac\daily_work\02_Oopj\day2> jcmd
// 2528 c:\Users\INDIA\.vscode\extensions\redhat.java-1.34.0-win32-x64\server\plugins\org.eclipse.equinox.launcher_1.6.900.v20240613-2009.jar -configuration c:\Users\INDIA\AppData\Roaming\Code\User\globalStorage\redhat.java\1.34.0\config_win -data c:\Users\INDIA\AppData\Roaming\Code\User\workspaceStorage\1bb39da5e3e325028a8ba8022cf6d712\redhat.java\jdt_ws --pipe=\\.\pipe\lsp-7442f5bae8746de47cf9ea54cbb05e92-sock
// 18900 Program2
// 7416 jdk.jcmd/sun.tools.jcmd.JCmd
// a\Roaming\Code\User\workspaceStorage\1bb39da5e3e325028a8ba8022cf6d712\redhat.java\jdt_ws --pipe=\\.\pipe\lsp-7442f5bae8746de47cf9ea54cbb05e92-sock
// 18900 Program2
// 7416 jdk.jcmd/sun.tools.jcmd.JCmd
// 18900 Program2
// 7416 jdk.jcmd/sun.tools.jcmd.JCmd

//PS D:\CDAC\pgdac\daily_work\02_Oopj\day2> jstack 18900 > thread.txt

