package com.kcy.notice.service;

import java.util.List;
import java.util.Map;

import com.kcy.quiz.service.QuizVo;
// 황하경 220831
public interface NoticeService {
	public void noticeInsert(NoticeVo vo);
	public void noticeModify(NoticeVo vo);
	public List<NoticeVo> noticeList(NoticeVo vo);
	public NoticeVo noticeView(int classNoticeNo);
	public List<NoticeVo> getSearchList(NoticeVo vo);
	public List<NoticeVo> getClassId(NoticeVo vo);
	public List<QuizVo> getClassIdProf(QuizVo vo);
}
