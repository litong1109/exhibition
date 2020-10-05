package com.zel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author zel
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class ZelExhibitionApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(ZelExhibitionApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
               /* " .-------.       ____     __        \n" +
                " |  _ _   \\      \\   \\   /  /    \n" +
                " | ( ' )  |       \\  _. /  '       \n" +
                " |(_ o _) /        _( )_ .'         \n" +
                " | (_,_).' __  ___(_ o _)'          \n" +
                " |  |\\ \\  |  ||   |(_,_)'         \n" +
                " |  | \\ `'   /|   `-'  /           \n" +
                " |  |  \\    /  \\      /           \n" +
                " ''-'   `'-'    `-..-'              "*/

            " ________  ________  __          ________            __        __  __        __    __      __                     \n" +
                "/        |/        |/  |        /        |          /  |      /  |/  |      /  |  /  |    /  |                    \n" +
                "$$$$$$$$/ $$$$$$$$/ $$ |        $$$$$$$$/  __    __ $$ |____  $$/ $$ |____  $$/  _$$ |_   $$/   ______   _______  \n" +
                "    /$$/  $$ |__    $$ | ______ $$ |__    /  \\  /  |$$      \\ /  |$$      \\ /  |/ $$   |  /  | /      \\ /       \\ \n" +
                "   /$$/   $$    |   $$ |/      |$$    |   $$  \\/$$/ $$$$$$$  |$$ |$$$$$$$  |$$ |$$$$$$/   $$ |/$$$$$$  |$$$$$$$  |\n" +
                "  /$$/    $$$$$/    $$ |$$$$$$/ $$$$$/     $$  $$<  $$ |  $$ |$$ |$$ |  $$ |$$ |  $$ | __ $$ |$$ |  $$ |$$ |  $$ |\n" +
                " /$$/____ $$ |_____ $$ |_____   $$ |_____  /$$$$  \\ $$ |  $$ |$$ |$$ |__$$ |$$ |  $$ |/  |$$ |$$ \\__$$ |$$ |  $$ |\n" +
                "/$$      |$$       |$$       |  $$       |/$$/ $$  |$$ |  $$ |$$ |$$    $$/ $$ |  $$  $$/ $$ |$$    $$/ $$ |  $$ |\n" +
                "$$$$$$$$/ $$$$$$$$/ $$$$$$$$/   $$$$$$$$/ $$/   $$/ $$/   $$/ $$/ $$$$$$$/  $$/    $$$$/  $$/  $$$$$$/  $$/   $$/"
        );
    }
}