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
				String emoti[]={"�ų���", "������","�������","�����","��ȯ��","������","��ο�"};
				
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
				String genti[]={"����", "��", "J-POP","OST","Ŭ����","����","�������","CCM","�ε����","Ʈ��Ʈ"};
			
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
