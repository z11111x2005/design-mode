package com.noob.study.design.mode.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: noob
 * @Date: 2019/10/24 16:39
 * @Description：
 */
public class Staff {
    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void executeCommand() {
        for (Command command : commandList){
            command.execute();
        }
        commandList.clear();
    }
}
