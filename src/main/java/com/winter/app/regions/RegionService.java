package com.winter.app.regions;



import java.io.File;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import com.winter.app.util.FileManager;
import com.winter.app.util.Pager;

//DAO 보내기 전에 전처리, 후처리
@Service
public class RegionService {
	
	@Autowired
	private RegionDAO regionDAO;
	
	@Autowired
	private FileManager fileManager; 
	
	@Autowired
	//내장객체 중 application
	private ServletContext servletContext;
	
	//delete
	public int delete(RegionDTO regionDTO)throws Exception{
		//파일명 조회
		List<RegionFileDTO> ar = regionDAO.getListFiles(regionDTO);
		
		//DB에서 삭제
		int result = regionDAO.delete(regionDTO);
		
		//경로 생성
		String path= servletContext.getRealPath("/resources/upload/regions");
		
		for(RegionFileDTO f:ar) {
			path=path+f.getFileName();
			
			//HDD에서 삭제
			fileManager.fileDelete(path);
		}
		
		
		return result;
	}
	
	//update
	public int update(RegionDTO regionDTO)throws Exception{
		return regionDAO.update(regionDTO);
	}
	
	//insert
	public int add(RegionDTO regionDTO, MultipartFile file)throws Exception{
		int result= regionDAO.add(regionDTO); 
		
		//1. 어디에 저장할 것인가??
		String path =servletContext.getRealPath("/resources/upload/regions");
		
		String fileName = fileManager.fileSave(path, file);
		
		
		
//		System.out.println(path);
//		File f= new File(path, "regions");
//		
//		//없으면
//		if(!f.exists()) {
//			//새로 만들어라
//			f.mkdirs();
//		}
//		
//		//2. 어떤 파일 명으로 저장할 것인가??
//		//a. 시간 사용
//		Calendar ca = Calendar.getInstance();
//		String fileName = ca.getTimeInMillis()+"_"+file.getOriginalFilename();
//		System.out.println(fileName);
//		
//		//b. UUID(유니버스 유니크 아이디)
//		fileName=UUID.randomUUID().toString()+"_"+file.getOriginalFilename();
//		System.out.println(fileName);
//
//		//3. 파일을 저장
//		//a. FileCopyUtils 클래스 사용
//		f= new File(f, fileName);
//		FileCopyUtils.copy(file.getBytes(), f);
		
		//4. DB에 정보 저장
		RegionFileDTO dto = new RegionFileDTO();
		dto.setFilName(fileName);
		dto.setOriName(file.getOriginalFilename());
		dto.setRegion_id(regionDTO.getRegion_id());
		result = regionDAO.addFile(dto);
		
		
		return result; //regionDAO.add(regionDTO);
	}
	
	//detail
	public RegionDTO getDetail (RegionDTO regionDTO)throws Exception{
		return regionDAO.getDetail(regionDTO);
	}
	
	//list
	public List<RegionDTO> getList(Pager pager)throws Exception{
		pager.makeRow();
		Long totalCount=regionDAO.getTotal(pager);
		System.out.println(totalCount);
		
		pager.makeNum(totalCount);
		
		List<RegionDTO> ar = this.regionDAO.getList(pager);
		
		return ar;
		
	}

}
