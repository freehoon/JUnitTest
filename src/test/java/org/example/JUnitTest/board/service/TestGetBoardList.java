package org.example.JUnitTest.board.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"file:src/main/resources/spring/*.xml"})
@ContextConfiguration(locations={"classpath:/spring/*.xml"})
public class TestGetBoardList {

    @Resource(name="boardService")
    private BoardService boardService;

    @Test
    public void getBoardListTest(){
        List<String> boardList = boardService.getBoardList();
        for (String board: boardList) {
            System.out.println(board);
        }
    }
}
