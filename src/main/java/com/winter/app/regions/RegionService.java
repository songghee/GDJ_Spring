package com.winter.app.regions;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//DAO 보내기 전에 전처리, 후처리
@Service
public class RegionService {
	
	@Autowired
	private RegionDAO regionDAO;
	
	//update
	public RegionDTO update (RegionDTO regionDTO)throws Exception{
		return regionDAO.update(regionDTO);
	}
	
	//insert
	public RegionDTO add(RegionDTO regionDTO)throws Exception{
		return regionDAO.add(regionDTO);
	}
	
	//detail
	public RegionDTO getDetail (RegionDTO regionDTO)throws Exception{
		return regionDAO.getDetail(regionDTO);
	}
	
	//list
	public List<RegionDTO> getList()throws Exception{
		List<RegionDTO> ar = this.regionDAO.getList();
		
		return ar;
		
	}

}
