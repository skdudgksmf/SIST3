package com.sist.emotion.genre;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import org.springframework.stereotype.Component;

@Component
public class GenreListManager {
	
	public List<KpopVO> GenKpop()
	{
		List<KpopVO> list=new ArrayList<KpopVO>();
		try
		{
			Document doc=Jsoup.connect("http://www.mnet.com/chart/Kpop/all/").get();
			Elements noElem=doc.select("div.MMLIRankNum_Box span.MMLI_RankNum");
			Elements titleElem=doc.select("div.MMLITitleSong_Box a.MMLI_Song");
			Elements artistElem=doc.select("div.MMLITitle_Info a.MMLIInfo_Artist");
			Elements albumElem=doc.select("div.MMLITitle_Info a.MMLIInfo_Album");
			
			for(int i=0;i<noElem.size();i++)
			{
				Element nelem=noElem.get(i);
				Element telem=titleElem.get(i);
				Element albelem=albumElem.get(i);
				String album=albelem.text();
				Element artelem=artistElem.get(i);
				String artist=artelem.text();
				
				KpopVO vo=new KpopVO();
				vo.setNo(nelem.text());
				vo.setTitle(telem.text());
				vo.setAlbum(album);
				vo.setArtist(artist);
				list.add(vo);
				
			}
		}catch(Exception ex)
		{
			System.out.println("GenKpop(): "+ex.getMessage());
		}
		return list;
	}
	
	
	public List<PopVO> GenPop()
	{
		List<PopVO> list=new ArrayList<PopVO>();
		try
		{
			Document doc=Jsoup.connect("http://www.mnet.com/chart/Pop/all/").get();
			Elements noElem=doc.select("div.MMLIRankNum_Box span.MMLI_RankNum");
			Elements titleElem=doc.select("div.MMLITitleSong_Box a.MMLI_Song");
			Elements artistElem=doc.select("div.MMLITitle_Info a.MMLIInfo_Artist");
			Elements albumElem=doc.select("div.MMLITitle_Info a.MMLIInfo_Album");
			
			for(int i=0;i<noElem.size();i++)
			{
				Element nelem=noElem.get(i);
				Element telem=titleElem.get(i);
				Element albelem=albumElem.get(i);
				String album=albelem.text();
				Element artelem=artistElem.get(i);
				String artist=artelem.text();
				
				PopVO vo=new PopVO();
				vo.setNo(nelem.text());
				vo.setTitle(telem.text());
				vo.setAlbum(album);
				vo.setArtist(artist);
				list.add(vo);
				
			}
		}catch(Exception ex)
		{
			System.out.println("GenPop(): "+ex.getMessage());
		}
		return list;
	}
	
	
	
	public List<JpopVO> GenJpop()
	{
		List<JpopVO> list=new ArrayList<JpopVO>();
		try
		{
			Document doc=Jsoup.connect("http://www.mnet.com/chart/Jpop/all/").get();
			Elements noElem=doc.select("div.MMLIRankNum_Box span.MMLI_RankNum");
			Elements titleElem=doc.select("div.MMLITitleSong_Box a.MMLI_Song");
			Elements artistElem=doc.select("div.MMLITitle_Info a.MMLIInfo_Artist");
			Elements albumElem=doc.select("div.MMLITitle_Info a.MMLIInfo_Album");
			
			for(int i=0;i<noElem.size();i++)
			{
				Element nelem=noElem.get(i);
				Element telem=titleElem.get(i);
				Element albelem=albumElem.get(i);
				String album=albelem.text();
				Element artelem=artistElem.get(i);
				String artist=artelem.text();
				
				JpopVO vo=new JpopVO();
				vo.setNo(nelem.text());
				vo.setTitle(telem.text());
				vo.setAlbum(album);
				vo.setArtist(artist);
				list.add(vo);
				
			}
		}catch(Exception ex)
		{
			System.out.println("GenJpop(): "+ex.getMessage());
		}
		return list;
	}
	
	
	
	public List<OSTVO> GenOst()
	{
		List<OSTVO> list=new ArrayList<OSTVO>();
		try
		{
			Document doc=Jsoup.connect("http://www.mnet.com/chart/Ost/all/").get();
			Elements noElem=doc.select("div.MMLIRankNum_Box span.MMLI_RankNum");
			Elements titleElem=doc.select("div.MMLITitleSong_Box a.MMLI_Song");
			Elements artistElem=doc.select("div.MMLITitle_Info a.MMLIInfo_Artist");
			Elements albumElem=doc.select("div.MMLITitle_Info a.MMLIInfo_Album");
			
			for(int i=0;i<noElem.size();i++)
			{
				Element nelem=noElem.get(i);
				Element telem=titleElem.get(i);
				Element albelem=albumElem.get(i);
				String album=albelem.text();
				Element artelem=artistElem.get(i);
				String artist=artelem.text();
				
				OSTVO vo=new OSTVO();
				vo.setNo(nelem.text());
				vo.setTitle(telem.text());
				vo.setAlbum(album);
				vo.setArtist(artist);
				list.add(vo);
				
			}
		}catch(Exception ex)
		{
			System.out.println("GenOst(): "+ex.getMessage());
		}
		return list;
	}
	
	
	
	public List<ClassicVO> GenClassic()
	{
		List<ClassicVO> list=new ArrayList<ClassicVO>();
		try
		{
			Document doc=Jsoup.connect("http://www.mnet.com/chart/Classical/all/").get();
			Elements noElem=doc.select("div.MMLIRankNum_Box span.MMLI_RankNum");
			Elements titleElem=doc.select("div.MMLITitleSong_Box a.MMLI_Song");
			Elements artistElem=doc.select("div.MMLITitle_Info a.MMLIInfo_Artist");
			Elements albumElem=doc.select("div.MMLITitle_Info a.MMLIInfo_Album");
			
			for(int i=0;i<noElem.size();i++)
			{
				Element nelem=noElem.get(i);
				Element telem=titleElem.get(i);
				Element albelem=albumElem.get(i);
				String album=albelem.text();
				Element artelem=artistElem.get(i);
				String artist=artelem.text();
				
				ClassicVO vo=new ClassicVO();
				vo.setNo(nelem.text());
				vo.setTitle(telem.text());
				vo.setAlbum(album);
				vo.setArtist(artist);
				list.add(vo);
				
			}
		}catch(Exception ex)
		{
			System.out.println("GenClassic(): "+ex.getMessage());
		}
		return list;
	}
	
	
	
	public List<JazzVO> GenJazz()
	{
		List<JazzVO> list=new ArrayList<JazzVO>();
		try
		{
			Document doc=Jsoup.connect("http://www.mnet.com/chart/Jazz/all/").get();
			Elements noElem=doc.select("div.MMLIRankNum_Box span.MMLI_RankNum");
			Elements titleElem=doc.select("div.MMLITitleSong_Box a.MMLI_Song");
			Elements artistElem=doc.select("div.MMLITitle_Info a.MMLIInfo_Artist");
			Elements albumElem=doc.select("div.MMLITitle_Info a.MMLIInfo_Album");
			
			for(int i=0;i<noElem.size();i++)
			{
				Element nelem=noElem.get(i);
				Element telem=titleElem.get(i);
				Element albelem=albumElem.get(i);
				String album=albelem.text();
				Element artelem=artistElem.get(i);
				String artist=artelem.text();
				
				JazzVO vo=new JazzVO();
				vo.setNo(nelem.text());
				vo.setTitle(telem.text());
				vo.setAlbum(album);
				vo.setArtist(artist);
				list.add(vo);
				
			}
		}catch(Exception ex)
		{
			System.out.println("GenJazz(): "+ex.getMessage());
		}
		return list;
	}
	
	
	
	
	public List<WorldMusicVO> GenWorld()
	{
		List<WorldMusicVO> list=new ArrayList<WorldMusicVO>();
		try
		{
			Document doc=Jsoup.connect("http://www.mnet.com/chart/World/all/").get();
			Elements noElem=doc.select("div.MMLIRankNum_Box span.MMLI_RankNum");
			Elements titleElem=doc.select("div.MMLITitleSong_Box a.MMLI_Song");
			Elements artistElem=doc.select("div.MMLITitle_Info a.MMLIInfo_Artist");
			Elements albumElem=doc.select("div.MMLITitle_Info a.MMLIInfo_Album");
			
			for(int i=0;i<noElem.size();i++)
			{
				Element nelem=noElem.get(i);
				Element telem=titleElem.get(i);
				Element albelem=albumElem.get(i);
				String album=albelem.text();
				Element artelem=artistElem.get(i);
				String artist=artelem.text();
				
				WorldMusicVO vo=new WorldMusicVO();
				vo.setNo(nelem.text());
				vo.setTitle(telem.text());
				vo.setAlbum(album);
				vo.setArtist(artist);
				list.add(vo);
				
			}
		}catch(Exception ex)
		{
			System.out.println("GenWorld(): "+ex.getMessage());
		}
		return list;
	}
	
	
	
	
	public List<CcmVO> GenCcm()
	{
		List<CcmVO> list=new ArrayList<CcmVO>();
		try
		{
			Document doc=Jsoup.connect("http://www.mnet.com/chart/Ccm/all/").get();
			Elements noElem=doc.select("div.MMLIRankNum_Box span.MMLI_RankNum");
			Elements titleElem=doc.select("div.MMLITitleSong_Box a.MMLI_Song");
			Elements artistElem=doc.select("div.MMLITitle_Info a.MMLIInfo_Artist");
			Elements albumElem=doc.select("div.MMLITitle_Info a.MMLIInfo_Album");
			
			for(int i=0;i<noElem.size();i++)
			{
				Element nelem=noElem.get(i);
				Element telem=titleElem.get(i);
				Element albelem=albumElem.get(i);
				String album=albelem.text();
				Element artelem=artistElem.get(i);
				String artist=artelem.text();
				
				CcmVO vo=new CcmVO();
				vo.setNo(nelem.text());
				vo.setTitle(telem.text());
				vo.setAlbum(album);
				vo.setArtist(artist);
				list.add(vo);
				
			}
		}catch(Exception ex)
		{
			System.out.println("GenCcm(): "+ex.getMessage());
		}
		return list;
	}
	
	
	
	
	public List<IndiMusicVO> GenIndi()
	{
		List<IndiMusicVO> list=new ArrayList<IndiMusicVO>();
		try
		{
			Document doc=Jsoup.connect("http://www.mnet.com/chart/Indie/all/").get();
			Elements noElem=doc.select("div.MMLIRankNum_Box span.MMLI_RankNum");
			Elements titleElem=doc.select("div.MMLITitleSong_Box a.MMLI_Song");
			Elements artistElem=doc.select("div.MMLITitle_Info a.MMLIInfo_Artist");
			Elements albumElem=doc.select("div.MMLITitle_Info a.MMLIInfo_Album");
			
			for(int i=0;i<noElem.size();i++)
			{
				Element nelem=noElem.get(i);
				Element telem=titleElem.get(i);
				Element albelem=albumElem.get(i);
				String album=albelem.text();
				Element artelem=artistElem.get(i);
				String artist=artelem.text();
				
				IndiMusicVO vo=new IndiMusicVO();
				vo.setNo(nelem.text());
				vo.setTitle(telem.text());
				vo.setAlbum(album);
				vo.setArtist(artist);
				list.add(vo);
				
			}
		}catch(Exception ex)
		{
			System.out.println("GenIndi(): "+ex.getMessage());
		}
		return list;
	}
	
	
	
	
	public List<TrotVO> GenTrot()
	{
		List<TrotVO> list=new ArrayList<TrotVO>();
		try
		{
			Document doc=Jsoup.connect("http://www.mnet.com/chart/Trot/all/").get();
			Elements noElem=doc.select("div.MMLIRankNum_Box span.MMLI_RankNum");
			Elements titleElem=doc.select("div.MMLITitleSong_Box a.MMLI_Song");
			Elements artistElem=doc.select("div.MMLITitle_Info a.MMLIInfo_Artist");
			Elements albumElem=doc.select("div.MMLITitle_Info a.MMLIInfo_Album");
			
			for(int i=0;i<noElem.size();i++)
			{
				Element nelem=noElem.get(i);
				Element telem=titleElem.get(i);
				Element albelem=albumElem.get(i);
				String album=albelem.text();
				Element artelem=artistElem.get(i);
				String artist=artelem.text();
				
				TrotVO vo=new TrotVO();
				vo.setNo(nelem.text());
				vo.setTitle(telem.text());
				vo.setAlbum(album);
				vo.setArtist(artist);
				list.add(vo);
				
			}
		}catch(Exception ex)
		{
			System.out.println("GenTrot(): "+ex.getMessage());
		}
		return list;
	}
	
	
	
}
