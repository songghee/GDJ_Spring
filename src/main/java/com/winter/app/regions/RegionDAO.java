package com.winter.app.regions;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.winter.app.util.Pager;

@Repository
public class RegionDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String namespace="com.winter.app.regions.RegionDAO.";
	
	//delete
	//삭제
	public int delete(RegionDTO regionDTO) throws Exception{
		return sqlSession.delete(namespace+"delete", regionDTO);
	}
	
	
	//update
	//수정
	public int update(RegionDTO regionDTO) throws Exception {
		return sqlSession.update(namespace+"update", regionDTO);
	
}
		
		
		//		Connection con = DBConnector.getConnector();
//		//db 연결
//		String sql="UPDATE REGIONS SET REGION_NAME=? WHERE REGION_ID=?";
//		//query 작성
//		PreparedStatement st = con.prepareStatement(sql);
//		//임시전송
//		st.setString(1, regionDTO.getRegion_name());
//		st.setInt(2, regionDTO.getRegion_id());
//		//? 수정
//		int result = st.executeUpdate();
//		
//		DBConnector.disConnect(st, con);
//		
//		return result;
//		
//	}
	
	public int addFile(RegionFileDTO regionFileDTO) throws Exception{
		return sqlSession.insert(namespace+"addFile", regionFileDTO);
		
	}
	
	
	//Insert
	//추가
	public int add(RegionDTO regionDTO)throws Exception{
		return sqlSession.insert(namespace+"add", regionDTO);
	}
	
//	public int add(RegionDTO regionDTO)throws Exception{
//		Connection con = DBConnector.getConnector();
//		
//		String sql = "INSERT INTO REGIONS VALUES(?, ?)";
//		
//		PreparedStatement st = con.prepareStatement(sql);
//		
//		st.setInt(1, regionDTO.getRegion_id());//111
//		st.setString(2, regionDTO.getRegion_name());//""hi
//		
//		int result = st.executeUpdate();
//		
//		DBConnector.disConnect(st, con);
//		
//		return result;
//	}
	
	//detail
	//하나만 읽기
	public RegionDTO getDetail(RegionDTO regionDTO)throws Exception{
		return sqlSession.selectOne(namespace+"getDetail", regionDTO);
		
	}
	
	public Long getTotal(Pager pager) throws Exception{
		return sqlSession.selectOne(namespace+"getTotal", pager);
	}

	public List<RegionDTO> getList(Pager pager)throws Exception{
		return sqlSession.selectList(namespace+"getList", pager);
	}
	
	//File List 1:N
	public List<RegionFileDTO> getListFiles(RegionDTO regionDTO)throws Exception{
		return sqlSession.selectList(namespace+"getListFiles", regionDTO);
	
	}
	
//	public HashMap<String, Object> getDetail(RegionDTO regionDTO)throws Exception{
//	return sqlSession.selectOne(namespace+"getDetail", regionDTO);
//}
//
//public List<HashMap<String, Object>> getList() throws Exception {
//	return sqlSession.selectList(namespace+"getList");
//}

	
}
//		public RegionDTO getDetail(RegionDTO regionDTO)throws Exception{
//		Connection con = DBConnector.getConnector();
//		
//		String sql = "SELECT * FROM REGIONS WHERE REGION_ID=?";
//		
//		PreparedStatement st = con.prepareStatement(sql);
//		
//		st.setInt(1, regionDTO.getRegion_id());
//		
//		ResultSet rs = st.executeQuery();
//		
//		RegionDTO resultDTO=null;
	
//		List<RegionDTO> ar = new ArrayList<RegionDTO>();
	
//		while(rs.next()) {
//			resultDTO = new RegionDTO(); 2 am// 
//			resultDTO.setRegion_id(rs.getInt("REGION_ID"));
//			resultDTO.setRegion_name(rs.getString("REGION_NAME"));
//			ar.add(resultDTO);
//		}
//		
//		return resultDTO;
//	}
	
//	public List<RegionDTO> getList() throws Exception {
	
		//1. driver를 메모리에 로딩(객체 생성)
		
//		Connection con =DBConnector.getConnector();
		//3. Sql문 생성
//		String sql = "SELECT REGION_NAME, REGION_ID FROM REGIONS";
			
			//4. SQL문 미리 전송
//		PreparedStatement st = con.prepareStatement(sql);
			
			//5.
			
			//6. 최종 전송 및 결과 처리
//		ResultSet rs = st.executeQuery();
		
//		List<RegionDTO> ar = new ArrayList<RegionDTO>();
//		
//		while (rs.next()) {
//				//rs = 1, Europe
//			RegionDTO regionDTO = new RegionDTO();
//			int n = rs.getInt("REGION_ID");
//			regionDTO.setRegion_id(n);
//			regionDTO.setRegion_name(rs.getString("REGION_NAME"));
//			
//			ar.add(regionDTO);
//		}
//
//		DBConnector.disConnect(rs, st, con);
//		return null;
//}