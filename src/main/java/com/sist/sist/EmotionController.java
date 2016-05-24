package com.sist.sist;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sist.emotion.*;
import com.sist.emotion.emotion.DarkVO;
import com.sist.emotion.emotion.DreamyVO;
import com.sist.emotion.emotion.EmotionListManager;
import com.sist.emotion.emotion.EmotionalVO;
import com.sist.emotion.emotion.InLoveVO;
import com.sist.emotion.emotion.LightVO;
import com.sist.emotion.emotion.PeacefulVO;
import com.sist.emotion.emotion.PlayFulVO;
import com.sist.emotion.genre.CcmVO;
import com.sist.emotion.genre.ClassicVO;
import com.sist.emotion.genre.GenreListManager;
import com.sist.emotion.genre.IndiMusicVO;
import com.sist.emotion.genre.JazzVO;
import com.sist.emotion.genre.JpopVO;
import com.sist.emotion.genre.KpopVO;
import com.sist.emotion.genre.OSTVO;
import com.sist.emotion.genre.PopVO;
import com.sist.emotion.genre.TrotVO;
import com.sist.emotion.genre.WorldMusicVO;

@Controller
public class EmotionController {
	@Autowired
	private EmotionManager em;
	
	@Autowired
	private EmotionListManager elm;
	
	@Autowired
	private GenreListManager glm;
	
	
	@RequestMapping("emotion_main.do")
	public String emotion_main(Model model)
	{
		List<EmotionVO> elist=em.Emotiontitle();
		List<GenreVO> glist=em.Genretitle();
		
		List<PlayFulVO> playful=elm.EmoPlayful();
		List<LightVO> light=elm.EmoLight();
		List<InLoveVO> love=elm.EmoInlove();
		List<PeacefulVO> peace=elm.EmoPeaceful();
		List<DreamyVO> dreamy=elm.EmoDreamy();
		List<EmotionalVO> emotional=elm.EmoEmotional();
		List<DarkVO> dark=elm.EmoDark();
		
		List<KpopVO>kpop=glm.GenKpop();
		List<PopVO> pop=glm.GenPop();
		List<JpopVO> jpop=glm.GenJpop();
		List<OSTVO> ost=glm.GenOst();
		List<ClassicVO> classic=glm.GenClassic();
		List<JazzVO> jazz=glm.GenJazz();
		List<WorldMusicVO> world=glm.GenWorld();
		List<CcmVO> ccm=glm.GenCcm();
		List<IndiMusicVO> indi=glm.GenIndi();
		List<TrotVO> trot=glm.GenTrot();
		
		
		model.addAttribute("elist", elist);
		model.addAttribute("glist", glist);
		
		model.addAttribute("playful", playful);
		model.addAttribute("light", light);
		model.addAttribute("love", love);
		model.addAttribute("peace", peace);
		model.addAttribute("dreamy", dreamy);
		model.addAttribute("emotional", emotional);
		model.addAttribute("dark", dark);
		
		model.addAttribute("kpop", kpop);
		model.addAttribute("pop", pop);
		model.addAttribute("jpop", jpop);
		model.addAttribute("ost", ost);
		model.addAttribute("classic", classic);
		model.addAttribute("jazz", jazz);
		model.addAttribute("world", world);
		model.addAttribute("ccm", ccm);
		model.addAttribute("indi", indi);
		model.addAttribute("trot", trot);
		

		return "drugflow/emotion_main";
	}

}
