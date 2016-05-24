package com.sist.emotion;


import java.util.*;
import org.springframework.stereotype.Component;



@Component
public class EmotionManager {
		
		public List<EmotionVO> Emotiontitle()
		{
			List<EmotionVO> list=new ArrayList<EmotionVO>();
			try
			{
				String emoti[]={"신나는", "경쾌한","사랑으로","편안한","몽환적","감성적","어두운"};
				
				for(int i=0;i<emoti.length;i++)
				{
					EmotionVO vo=new EmotionVO();
					vo.setEmotion(emoti[i]);
					list.add(vo);
				}
			}catch(Exception ex)
			{
				System.out.println("Emotiontitle(): "+ex.getMessage());
			}
			return list;
		}
		
		
		public List<GenreVO> Genretitle()
		{
			List<GenreVO> list=new ArrayList<GenreVO>();
			try
			{
				String genti[]={"가요", "팝", "J-POP","OST","클래식","재즈","월드뮤직","CCM","인디뮤직","트로트"};
			
				for(int i=0;i<genti.length;i++)
				{
					GenreVO vo=new GenreVO();
					vo.setGenre(genti[i]);
					list.add(vo);
				}
			}catch(Exception ex)
			{
				System.out.println("Emotiontitle(): "+ex.getMessage());
			}
			return list;
		}
	
}
