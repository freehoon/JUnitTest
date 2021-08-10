package org.example.JUnitTest.board.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
    @Override
    public List<String> getBoardList() {
        List<String> boardList = new ArrayList<String>();
        boardList.add("1111");
        boardList.add("2222");
        boardList.add("3333");
        return boardList;
    }
}
