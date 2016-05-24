package com.sist.emotion.emotion;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

@Component
public class EmotionListManager {
		
	public List<PlayFulVO> EmoPlayful()
	{
		List<PlayFulVO> list=new ArrayList<PlayFulVO>();
		try
		{
			Document doc=Jsoup.connect("http://www.mnet.com/genre/ThemeMusic/Playful").get();
			Elements noElem=doc.select("div.MMLTable table tbody tr td.MMLItemRank");
			Elements titleElem=doc.select("div.MMLITitleSong_Box a.MMLI_Song");
			Elements albumElem=doc.select("div.MMLIAlbum_Box a.MMLI_Album");
			Elements artistElem=doc.select("div.MMLIArtist_Box a");
			
			for(int i=0;i<noElem.size();i++)
			{
				Element nelem=noElem.get(i);
				Element telem=titleElem.get(i);
				Element albelem=albumElem.get(i);
				String album=albelem.text();
				Element artelem=artistElem.get(i);
				String artist=artelem.text();
				
				
				PlayFulVO vo=new PlayFulVO();
				vo.setNo(Integer.parseInt(nelem.text()));
				vo.setTitle(telem.text());
				vo.setAlbum(album);
				vo.setArtist(artist);
				list.add(vo);
				
			}
		}catch(Exception ex)
		{
			System.out.println("EmoPlayful(): "+ex.getMessage());
		}
		return list;
	}
	
	
	public List<LightVO> EmoLight()
	{
		List<LightVO> list=new ArrayList<LightVO>();
		try
		{
			Document doc=Jsoup.connect("http://www.mnet.com/genre/ThemeMusic/happy").get();
			Elements noElem=doc.select("div.MMLTable table tbody tr td.MMLItemRank");
			Elements titleElem=doc.select("div.MMLITitleSong_Box a.MMLI_Song");
			Elements artistElem=doc.select("div.MMLIArtist_Box a");
			Elements albumElem=doc.select("div.MMLIAlbum_Box a.MMLI_Album");
			
			for(int i=0;i<noElem.size();i++)
			{
				Element nelem=noElem.get(i);
				Element telem=titleElem.get(i);
				Element albelem=albumElem.get(i);
				String album=albelem.text();
				Element artelem=artistElem.get(i);
				String artist=artelem.text();
				
				LightVO vo=new LightVO();
				vo.setNo(Integer.parseInt(nelem.text()));
				vo.setTitle(telem.text());
				vo.setAlbum(album);
				vo.setArtist(artist);
				list.add(vo);
				
			}
		}catch(Exception ex)
		{
			System.out.println("EmoLight(): "+ex.getMessage());
		}
		return list;
	}
	
	
	
	public List<InLoveVO> EmoInlove()
	{
		List<InLoveVO> list=new ArrayList<InLoveVO>();
		try
		{
			Document doc=Jsoup.connect("http://www.mnet.com/genre/ThemeMusic/lovely").get();
			Elements noElem=doc.select("div.MMLTable table tbody tr td.MMLItemRank");
			Elements titleElem=doc.select("div.MMLITitleSong_Box a.MMLI_Song");
			Elements artistElem=doc.select("div.MMLIArtist_Box a");
			Elements albumElem=doc.select("div.MMLIAlbum_Box a.MMLI_Album");
			
			for(int i=0;i<noElem.size();i++)
			{
				Element nelem=noElem.get(i);
				Element telem=titleElem.get(i);
				Element albelem=albumElem.get(i);
				String album=albelem.text();
				Element artelem=artistElem.get(i);
				String artist=artelem.text();
				
				InLoveVO vo=new InLoveVO();
				vo.setNo(Integer.parseInt(nelem.text()));
				vo.setTitle(telem.text());
				vo.setAlbum(album);
				vo.setArtist(artist);
				list.add(vo);
				
			}
		}catch(Exception ex)
		{
			System.out.println("EmoInlove(): "+ex.getMessage());
		}
		return list;
	}
	
	
	
	public List<PeacefulVO> EmoPeaceful()
	{
		List<PeacefulVO> list=new ArrayList<PeacefulVO>();
		try
		{
			Document doc=Jsoup.connect("http://www.mnet.com/genre/ThemeMusic/peaceful").get();
			Elements noElem=doc.select("div.MMLTable table tbody tr td.MMLItemRank");
			Elements titleElem=doc.select("div.MMLITitleSong_Box a.MMLI_Song");
			Elements artistElem=doc.select("div.MMLIArtist_Box a");
			Elements albumElem=doc.select("div.MMLIAlbum_Box a.MMLI_Album");
			
			for(int i=0;i<noElem.size();i++)
			{
				Element nelem=noElem.get(i);
				Element telem=titleElem.get(i);
				Element albelem=albumElem.get(i);
				String album=albelem.text();
				Element artelem=artistElem.get(i);
				String artist=artelem.text();
				
				PeacefulVO vo=new PeacefulVO();
				vo.setNo(Integer.parseInt(nelem.text()));
				vo.setTitle(telem.text());
				vo.setAlbum(album);
				vo.setArtist(artist);
				list.add(vo);
				
			}
		}catch(Exception ex)
		{
			System.out.println("EmoPeaceful(): "+ex.getMessage());
		}
		return list;
	}
	
	
	
	
	public List<DreamyVO> EmoDreamy()
	{
		List<DreamyVO> list=new ArrayList<DreamyVO>();
		try
		{
			Document doc=Jsoup.connect("http://www.mnet.com/genre/ThemeMusic/dreamy").get();
			Elements noElem=doc.select("div.MMLTable table tbody tr td.MMLItemRank");
			Elements titleElem=doc.select("div.MMLITitleSong_Box a.MMLI_Song");
			Elements artistElem=doc.select("div.MMLIArtist_Box a");
			Elements albumElem=doc.select("div.MMLIAlbum_Box a.MMLI_Album");
			
			for(int i=0;i<noElem.size();i++)
			{
				Element nelem=noElem.get(i);
				Element telem=titleElem.get(i);
				Element albelem=albumElem.get(i);
				String album=albelem.text();
				Element artelem=artistElem.get(i);
				String artist=artelem.text();
				
				DreamyVO vo=new DreamyVO();
				vo.setNo(Integer.parseInt(nelem.text()));
				vo.setTitle(telem.text());
				vo.setAlbum(album);
				vo.setArtist(artist);
				list.add(vo);
				
			}
		}catch(Exception ex)
		{
			System.out.println("EmoDreamy(): "+ex.getMessage());
		}
		return list;
	}
	
	
	
	
	public List<EmotionalVO> EmoEmotional()
	{
		List<EmotionalVO> list=new ArrayList<EmotionalVO>();
		try
		{
			Document doc=Jsoup.connect("http://www.mnet.com/genre/ThemeMusic/emotional").get();
			Elements noElem=doc.select("div.MMLTable table tbody tr td.MMLItemRank");
			Elements titleElem=doc.select("div.MMLITitleSong_Box a.MMLI_Song");
			Elements artistElem=doc.select("div.MMLIArtist_Box a");
			Elements albumElem=doc.select("div.MMLIAlbum_Box a.MMLI_Album");
			
			for(int i=0;i<noElem.size();i++)
			{
				Element nelem=noElem.get(i);
				Element telem=titleElem.get(i);
				Element albelem=albumElem.get(i);
				String album=albelem.text();
				Element artelem=artistElem.get(i);
				String artist=artelem.text();
				
				EmotionalVO vo=new EmotionalVO();
				vo.setNo(Integer.parseInt(nelem.text()));
				vo.setTitle(telem.text());
				vo.setAlbum(album);
				vo.setArtist(artist);
				list.add(vo);
				
			}
		}catch(Exception ex)
		{
			System.out.println("EmoEmotional(): "+ex.getMessage());
		}
		return list;
	}
	
	
	
	
	public List<DarkVO> EmoDark()
	{
		List<DarkVO> list=new ArrayList<DarkVO>();
		try
		{
			Document doc=Jsoup.connect("http://www.mnet.com/genre/ThemeMusic/dark").get();
			Elements noElem=doc.select("div.MMLTable table tbody tr td.MMLItemRank");
			Elements titleElem=doc.select("div.MMLITitleSong_Box a.MMLI_Song");
			Elements artistElem=doc.select("div.MMLIArtist_Box a");
			Elements albumElem=doc.select("div.MMLIAlbum_Box a.MMLI_Album");
			
			for(int i=0;i<noElem.size();i++)
			{
				Element nelem=noElem.get(i);
				Element telem=titleElem.get(i);
				Element albelem=albumElem.get(i);
				String album=albelem.text();
				Element artelem=artistElem.get(i);
				String artist=artelem.text();
				
				DarkVO vo=new DarkVO();
				vo.setNo(Integer.parseInt(nelem.text()));
				vo.setTitle(telem.text());
				vo.setAlbum(album);
				vo.setArtist(artist);
				list.add(vo);
				
			}
		}catch(Exception ex)
		{
			System.out.println("EmoDark(): "+ex.getMessage());
		}
		return list;
	}
	
	
	
	
}
