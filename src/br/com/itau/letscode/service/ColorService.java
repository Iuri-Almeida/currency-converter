package br.com.itau.letscode.service;

import br.com.itau.letscode.constant.ProgramConstants;

public class ColorService {

    public void yellow(String txt) {
        System.out.print(ProgramConstants.YELLOW_COLOR + txt + this.reset());
    }

    public void purple(String txt) {
        System.out.print(ProgramConstants.PURPLE_COLOR + txt + this.reset());
    }

    public void blue(String txt) {
        System.out.print(ProgramConstants.BLUE_COLOR + txt + this.reset());
    }

    public void cyan(String txt) {
        System.out.print(ProgramConstants.CYAN_COLOR + txt + this.reset());
    }

    public void green(String txt) {
        System.out.print(ProgramConstants.GREEN_COLOR + txt + this.reset());
    }

    public void red(String txt) {
        System.out.print(ProgramConstants.RED_COLOR + txt + this.reset());
    }

    private String reset() {
        return ProgramConstants.RESET_COLOR;
    }

}
