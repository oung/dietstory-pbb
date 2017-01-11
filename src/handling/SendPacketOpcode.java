package handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import tools.ExternalCodeTableGetter;
import tools.IntValueHolder;

public enum SendPacketOpcode implements IntValueHolder {

	// General
	PING,

	// CLogin::OnPacket
	LOGIN_STATUS,
	SERVERLIST,
	ENABLE_RECOMMENDED,
	SEND_RECOMMENDED,
	SET_CLIENT_KEY,
	SELECT_WORLD,
	CHARLIST,
	SERVER_IP,
	LOGIN_SECOND,
	CHAR_NAME_RESPONSE,
	ADD_NEW_CHAR_ENTRY,
	DELETE_CHAR_RESPONSE,
	CLIENT_HELLO,
	CHANGE_CHANNEL,
	TOGGLE_CASHSHOP,
	AUTH_RESPONSE,
	PART_TIME,
	PIC_RESPONSE,
	CLIENT_START,
	SERVERSTATUS,
	AUTHSERVER,
	REGISTER_PIC_RESPONSE,
	SPECIAL_CREATION,
	SECONDPW_ERROR,

	// CWvsContext::OnPacket
	INVENTORY_OPERATION,
	INVENTORY_GROW,
	STAT_CHANGED,
	TEMPORARY_STAT_SET,
	TEMPORARY_STAT_RESET,
	FORCED_STAT_SET,
	FORCED_STAT_RESET,
	CHANGE_SKILL_RECORD_RESULT,
	CHANGE_STEAL_MEMORY_RESULT,
	USER_DAMAGE_ON_FALLING_CHECK,
	PERSONAL_SHOP_BUY_CHECK,
	MOB_DROP_MESO_PICKUP,
	BREAK_TIME_FIELD_ENTER,
	RUNE_ACT_SUCCESS,
	RESULT_STEAL_SKILL_LIST,
	SKILL_USE_RESULT,
	EXCL_REQUEST,
	GIVE_POPULARITY_RESULT,
	MESSAGE,
	MEMO_RESULT,
	MAP_TRANSFER_RESULT,
	ANTI_MACRO_RESULT,
	ANTI_MACRO_BOMB_RESULT,
	CLAIM_RESULT,
	SET_CLAIM_SVR_AVAILABLE_TIME,
	CLAIM_SVR_STATUS_CHANGED,
	SET_TAMING_MOB_INFO,
	QUEST_CLEAR,
	ENTRUSTED_SHOP_CHECK_RESULT,
	SKILL_LEARN_ITEM_RESULT,
	SKILL_RESET_ITEM_RESULT,
	ABILITY_RESET_ITEM_RESULT,
	EXP_CONSUME_ITEM_RESULT,
	EXP_ITEM_GET_RESULT,
	CHAR_SLOT_INC_RESULT,
	CHAR_RENAME_RESULT,
	GATHER_ITEM_RESULT,
	SORT_ITEM_RESULT,
	CHARACTER_INFO,
	PARTY_RESULT,
	PARTY_MEMBER_CANDIDATE_RESULT,
	URUS_PARTY_MEMBER_CANDIDATE_RESULT,
	PARTY_CANDIDATE_RESULT,
	INTRUSION_FRIEND_CANDIDATE_RESULT,
	INTRUSION_LOBBY_CANDIDATE_RESULT,
	BOOK_INFO,
	CODEX_INFO_RESPONSE,
	EXPEDITION_RESULT,
	FRIEND_RESULT,
	STAR_FRIEND_RESULT,
	GUILD_REQUEST,
	GUILD_RESULT,
	ALLIANCE_RESULT,
	TOWN_PORTAL,
	BROADCAST_MESSAGE,
	INCUBATOR_RESULT,
	SHOP_SCANNER_RESULT,
	SHOP_LINK_RESULT,
	MARRIAGE_REQUEST,
	MARRIAGE_RESULT,
	WEDDING_GIFT_RESULT,
	NOTIFY_MARRIED_PARTNER_MAP_TRANSFER,
	CASH_PET_FOOD_RESULT,
	CASH_PET_PICK_UP_ON_OFF_RESULT,
	CASH_PET_SKILL_SETTING_RESULT,
	CASH_LOOK_CHANGE_RESULT,
	CASH_PET_DYEING_RESULT,
	SET_WEEK_EVENT_MESSAGE,
	SET_POTION_DISCOUNT_RATE,
	BRIDLE_MOB_CATCH_FAIL,
	IMITATED_NPC_DATA,
	LIMITED_NPC_DISABLE_INFO,
	MONSTER_BOOK_SET_CARD,
	MONSTER_BOOK_SET_COVER,
	HOUR_CHANGED,
	MINI_MAP_ON_OFF,
	CONSULT_AUTHKEY_UPDATE,
	CLASS_COMPETITION_AUTHKEY_UPDATE,
	BOOK_STATS,
	FAMILIAR_INFO,
	WEB_BOARD_AUTHKEY_UPDATE,
	SESSION_VALUE,
	PARTY_VALUE,
	FIELD_VALUE,
	BONUS_EXP_RATE_CHANGED,
	SEND_PEDIGREE,
	OPEN_FAMILY,
	FAMILY_MESSAGE,
	FAMILY_INVITE,
	FAMILY_JUNIOR,
	SENIOR_MESSAGE,
	FAMILY,
	REP_INCREASE,
	FAMILY_LOGGEDIN,
	FAMILY_BUFF,
	FAMILY_USE_REQUEST,
	NOTIFY_LEVEL_UP,
	NOTIFY_WEDDING,
	NOTIFY_JOB_CHANGE,
	SET_BUY_EQUIP_EXT,
	SET_PASSENGER_REQUEST,
	SCRIPT_PROGRESS_MESSAGE_BY_SOUL,
	SCRIPT_PROGRESS_MESSAGE,
	SCRIPT_PROGRESS_ITEM_MESSAGE,
	STATIC_SCREEN_MESSAGE,
	OFF_STATIC_SCREEN_MESSAGE,
	WEATHER_EFFECT_NOTICE,
	WEATHER_EFFECT_NOTICE_Y,
	PROGRESS_MESSAGE_FONT,
	DATA_CRC_CHECK_FAILED,
	SHOW_SLOT_MESSAGE,
	WILD_HUNTER_INFO,
	ZERO_INFO,
	ZERO_WP,
	ZERO_INFO_SUB_HP,
	UI_OPEN,
	CLEAR_ANNOUNCED_QUEST,
	YOUR_INFORMATION,
	FIND_FRIEND,
	VISITOR,
	ULTIMATE_EXPLORER,
	RESULT_INSTANCE_TABLE, // was SPECIAL_STAT
	COOL_TIME_SET,
	ITEM_POT_CHANGE,
	SET_ITEM_COOL_TIME,
	SET_AD_DISPLAY_INFO,
	SET_AD_DISPLAY_STATUS,
	SET_SON_OF_LINKED_SKILL_RESULT,
	SET_MAPLE_STYLE_INFO,
	MULUNG_DOJO_RANKING,
	SHUT_DOWN_MESSAGE,
	REPLACE_SKILLS,
	SLASH_COMMAND,
	START_NAVIGATION,
	FUNCKEY_SET_BY_SCRIPT,
	INNER_ABILITY_MSG,
	CHARACTER_POTENTIAL_SET,
	CHARACTER_POTENTIAL_RESET,
	CHARACTER_HONOR_EXP,
	ASWAN_RESULT,
	READY_FOR_RESPAWN,
	READY_FOR_RESPAWN_BY_POINT,
	READY_FOR_RESPAWN_UI,
	CHARACTER_HONOR_GIFT,
	CROSS_HUNTER_COMPLETE_RESULT,
	CROSS_HUNTER_SHOP_RESULT,
	SET_CASH_ITEM_NOTICE,
	SET_SPECIAL_CASH_ITEM,
	SHOW_EVENT_NOTICE,
	BOARD_GAME_RESULT,
	YUT_GAME_RESULT,
	VALUE_PACK_RESULT,
	NAVI_FLYING_RESULT,
	MAPLE_STYLE_RESULT,
	CHECK_WEDDING_RESULT,
	BINGO_RESULT,
	BINGO_CASSANDRA_RESULT,
	UPDATE_VIP_GRADE,
	MESO_RANGER_RESULT,
	SET_MAPLE_POINT,
	ADDITIONAL_CASH_INFO,
	SET_MIRACLE_TIME_INFO,
	HYPER_SKILL_RESET_RESULT,
	GET_SERVER_TIME,
	GET_CHARACTER_POSITION,
	BUTTERFLY_CUSTOMIZE,
	SET_FIX_DAMAGE,
	RETURN_EFFECT_CONFIRM,
	RETURN_EFFECT_MODIFIED,
	WHITE_ADDITIONAL_CUBE_RESULT,
	BLACK_CUBE_RESULT,
	MEMORIAL_CUBE_RESULT,
	MEMORIAL_CUBE_MODIFIED,
	DRESS_UP_INFO_MODIFIED,
	RESET_ON_STATE_FOR_ON_OFF_SKILL,
	SET_OFF_STATE_FOR_ON_OFF_SKILL,
	AVATAR_PACK_TEST,
	UNLOCK_CHARGE_SKILL,
	LOCK_CHARGE_SKILL,
	EVOLVING_RESULT,
	ISSUE_RELOGIN_COOKIE,
	ACTION_BAR_RESULT,
	GUILD_CONTENT_RANK,
	GUILD_SEARCH_RESULT,
	GET_REWARD_RESULT,
	MENTORING,
	LOTTERY_RESULT,
	CHECK_PROGRESS_RESULT,
	COMPLETE_NPC_SPEECH_SUCCESS,
	COMPLETE_SPECIAL_CHECK_SUCCESS,
	SET_GACHAPON_FEVER_TIME_INFO,
	ON_AVATAR_MEGAPHONE_RES,
	SET_AVATAR_MEGAPHONE,
	CLEAR_AVATAR_MEGAPHONE,
	REQUEST_EVENT_LIST,
	LIKE_POINT,
	SIGN_ERROR_ACK,
	ASK_AFTER_ERROR_ACK,
	EVENT_NAME_TAG,
	ACQUIRE_EVENT_NAME_TAG,
	JOB_FREE_CHANGE_RESULT,
	EVENT_LOTTERY_OPEN,
	EVENT_LOTTERY_RESULT,
	SCREEN_MSG,
	TRADE_BLOCK_FOR_SNAP_SHOT,
	MONSTER_BATTLE_SYSTEM_RESULT,
	MONSTER_BATTLE_COMBAT_RESULT,
	UNIVERSE_BOSS_POSSIBLE,
	UNIVERSE_BOSS_IMPOSSIBLE,
	CASH_SHOP_PREVIEW_INFO,
	CHANGE_SOUL_COLLECTION_RESULT,
	SELECT_SOUL_COLLECTION_RESULT,
	MASTER_PIECE_AWARD,
	BOSS_ARENA_MATCH_SUCCESS,
	BOSS_ARENA_MATCH_FAIL,
	BOSS_ARENA_MATCH_REQUEST_DONE,
	USER_SOUL_MATCHING,
	CATAPULT_UPGRADE_SKILL,
	CATAPULT_RESET_SKILL,
	PARTY_QUEST_RANKING_RESULT,
	WORLD_TRANSFER_RESULT,
	TRUNK_SLOT_INC_RESULT,
	ELITE_MOB_WMI,
	RANDOM_PORTAL_NOTICE,
	NOTIFY_WORLD_TRANSFER_HELPER,
	EQUIPMENT_ENCHANT,
	TOP_TOWER_RANK_RESULT,
	FRIEND_TOWER_RANK_RESULT,
	TOWER_RESULT_UI_OPEN,
	MANNEQUIN_RESULT,
	IRON_BOX_PACKET,
	CREATE_KOREAN_JUMPING_GAME,
	CREATE_SWING_GAME,
	UPDATE_MAPLE_TV_SHOW_TIME,
	RETURN_TO_TITLE,
	RETURN_TO_CHARACTER_SELECT,
	FLAME_WIZARD_FLAME_WALK_EFFECT,
	FLAME_WIZARD_FLARE_BLINK,
	SUMMONED_AVATAR_SYNC,
	CASH_SHOP_EVENT_INFO,
	BLACK_LIST,
	OPEN_UI_TEST,
	BLACK_LIST_VIEW,
	SCROLL_UPGRADE_FEVER_TIME,
	TEXT_EQUIP_INFO,
	TEXT_EQUIP_UI_OPEN,
	UI_START_PLANET_MINI_GAME_RESULT,
	UI_STAR_PLANET_TREND_SHOP,
	UI_STAR_PLANET_MINI_GAME_QUEUE,
	STAR_PLANET_ROUND_INFO,
	STAR_PLANET_RESULT,
	BACK_SPEED_CTRL,
	SET_MAZE_AREA,
	CHARACTER_BURNING,
	BATTLE_STAT_CORE_INFO,
	BATTLE_STAT_CORE_ACK,
	GACHAPON_TEST_RESULT,
	MASTER_PIECE_TEST_RESULT,
	ROYAL_STYLE_TEST_RESULT,
	BEAUTY_COUPON_TEST_RESULT,
	NICK_SKILL_EXPIRED,
	RANDOM_MISSION_RESULT,
	TWELVTH_TRESURE_RESULT,
	TWELVTH_TRESURE_BUFF,
	ITEM_COLLECTION_RESULT,
	CHECK_COLLECTION_COMPLETE_RESULT,
	ITEM_COLLECTION_LIST,
	RECEIVE_TOADS_HAMMER_REQUEST_RESULT,
	RECEIVE_HYPER_STAT_SKILL_RESET_RESULT,
	UPDATE_GENDER,
	BBS_OPERATION,
	CARD_DROPS,
	GM_POLICE,
	GM_STORY_BOARD,
	PINKBEAN_CHOCO,
	PAM_SONG,
	DISALLOW_DELIVERY_QUEST,
	MAGIC_WHEEL,
	REWARD,
	SKILL_MACRO,
	RED_CUBE_RESULT,
	MESSENGER_OPEN,

	// CStage::OnPacket
	SET_FIELD,
	SET_MONSTER_FARM,
	SET_CASH_SHOP,

	// CField::OnPacket
	TRANSFER_FIELD_REQ_IGNORED,
	TRANSFER_CHANNEL_REQ_IGNORED,
	TRANSFER_PVP_REQ_IGNORED,
	FIELD_SPECIFIC_DATA,
	GROUP_MESSAGE,
	FIELD_UNIVERSE_MESSAGE,
	WHISPER,
	SPOUSE_CHAT,
	FIELD_EFFECT,
	MOVE_ENV,
	UPDATE_ENV,
	BLOW_WEATHER,
	PLAY_JUKE_BOX,
	ADMIN_RESULT,
	OX_QUIZ,
	DESC,
	CLOCK,
	BOAT_MOVE,
	BOAT_STATE,
	STOP_CLOCK,
	ARIANT_SCOREBOARD,
	PYRAMID_UPDATE,
	PYRAMID_RESULT,
	QUICK_SLOT,// 0x151
	MOVE_PLATFORM,
	PYRAMID_KILL_COUNT,
	VMATRIX_UPDATE,
	NODESTONE_RESULT,
	PVP_INFO,// 0x156
	DIRECTION_STATUS,
	GAIN_FORCE,
	ACHIEVEMENT_RATIO,
	QUICK_MOVE,
	INTRUSION,
	SHOW_POTENTIAL_BLACK_CUBE,

	// CUserPool::OnPacket
	SPAWN_PLAYER,
	REMOVE_PLAYER_FROM_MAP,

	// CUserPool::OnUserCommonPacket
	CHAT,
	AD_BOARD,
	MINIROOM_BALLOON,
	SHOW_CONSUME_ITEM_EFFECT,
	SHOW_ITEM_UPGRADE_EFFECT,
	SHOW_ITEM_RELEASE_EFFECT,
	SHOW_ITEM_UNRELEASE_EFFECT,
	SHOW_ITEM_LUCKY_ITEM_EFFECT,
	SHOW_ITEM_MEMORIAL_EFFECT,
	SHOW_ITEM_ADDITIONAL_UNRELEASE_EFFECT,
	SHOW_ITEM_ADDITIONAL_SLOT_EXTEND_EFFECT,
	SHOW_ITEM_FIREWORKS_EFFECT,
	SHOW_ITEM_OPTION_CHANGE_EFFECT,
	SHOW_ITEM_SKILL_SOCKET_UPGRADE_EFFECT,
	SHOW_ITEM_SKILL_OPTION_UPGRADE_EFFECT,
	PVP_ATTACK,
	PVP_MIST,
	PVP_COOL,
	TESLA_TRIANGLE,
	FOLLOW_EFFECT,
	SHOW_PQ_REWARD,
	CRAFT_EFFECT,
	CRAFT_COMPLETE,
	HARVESTED,
	PLAYER_DAMAGED,
	NETT_PYRAMID,
	PAMS_SONG,

	// CUser::OnPetPacket
	SPAWN_PET,
	SPAWN_PET_2,
	MOVE_PET,
	PET_CHAT,
	PET_NAMECHANGE,
	PET_EXCEPTION_LIST,
	PET_COLOR,
	PET_SIZE,
	PET_COMMAND,

	// CUser::OnDragonPacket
	DRAGON_SPAWN,
	DRAGON_MOVE,
	DRAGON_REMOVE,

	// CUser::OnAndroidPacket
	ANDROID_SPAWN,
	ANDROID_MOVE,
	ANDROID_EMOTION,
	ANDROID_UPDATE,
	ANDROID_DEACTIVATED,

	// CUser::OnFoxManPacket
	HAKU_CHANGE_1,
	HAKU_CHANGE_0,
	SPAWN_HAKU,
	HAKU_MOVE,
	HAKU_CHANGE,

	CHATTEXT_1,

	// CUser::OnFamiliarPacket
	SPAWN_FAMILIAR,
	MOVE_FAMILIAR,
	TOUCH_FAMILIAR,
	ATTACK_FAMILIAR,
	RENAME_FAMILIAR,
	SPAWN_FAMILIAR_2,
	UPDATE_FAMILIAR,

	// CUserPool::OnUserRemotePacket
	MOVE_PLAYER,
	CLOSE_RANGE_ATTACK,
	RANGED_ATTACK,
	MAGIC_ATTACK,
	ENERGY_ATTACK,
	SKILL_PREPARE,
	MOVING_SHOOT_ATTACK_PREPARE,
	SKILL_CANCEL,
	HIT,
	EMOTICON_REMOTE,
	ADNROID_EMOTICON_REMOTE,
	SET_ACTIVE_EFFECT_ITEM,
	SET_MONKEY_EFFECT_ITEM,
	ACTIVE_NICK_ITEM,
	DEFAULT_WING_ITEM,
	SET_KAISER_TRANSFORM_ITEM,
	SET_CUSTOM_RIDING,
	SHOW_UPGRADE_TOMB_ITEM,
	SET_ACTIVE_PORTABLE_CHAIR,
	AVATAR_MODIFIED,
	EFFECT_REMOTE,
	SET_TEMPORARY_STAT_REMOTE,
	RESET_TEMPORARY_STAT_REMOTE,
	RECEIVE_HP_REMOTE,
	GUILD_NAME_CHANGED_REMOTE,
	GUILD_MARK_CHANGED_REMOTE,
	PVP_TEAM_CHANGED,
	GATHER_ACTION_SET,
	UPDATE_PVP_HP_TAG,
	DRAGON_GLIDE,
	KEY_DOWN_AREA_MOVE_PATH,
	LASER_INFO_FOR_REMOTE,
	KAISER_COLOR_OR_MORPH_CHANGE,
	DESTROY_GRENADE,
	SET_ITEM_ACTION,
	ZERO_TAG,
	INTRUSION_REMOTE,
	ZERO_LAST_ASSIST_STATE,
	SET_MOVE_GRENADE,
	SET_CUSTOMIZE_EFFECT,
	RUNE_STONE_ACTION,
	KINESIS_PSYCHIC_ENERGY_SHIELD_EFFECT,
	DRAGON_ACTION,
	DRAGON_BREATH_EARTH_EFFECT,
	RELEASE_RW_GRAB,
	RW_MULTI_CHARGE_CANCEL_REQUEST,
	SCOUTER_MAX_DAMAGE_UPDATE,
	STIGMA_DELIVERY_RESPONSE,
	THROW_GRANADE,

	CANCEL_CHAIR,

	INNER_ABILITY_RESET_MSG,

	// CUserPool::OnUserLocalPacket
	EMOTICON,
	ANDROID_EMOTICON,
	MOVE_SCREEN,
	EFFECT,
	TELEPORT,
	MESO_GIVE_SUCCEEDED,
	MESO_GIVE_FAILED,
	QUEST_RESULT,
	NOTIFY_HP_DEC_BY_FIELD,
	USER_PET_SKILL_CHANGED,
	BALLOON_MSG,
	PLAY_EVENT_SOUND,
	PLAY_MINIGAME_SOUND,
	MAKER_RESULT,
	OPEN_CONSULT_BOARD,
	OPEN_CLASS_COMPETITION_PAGE,
	OPEN_UI,
	OPEN_UI_WITH_OPTION,
	SET_DIRECTION_MODE,
	SET_IN_GAME_DIRECTION_MODE,
	SET_STAND_ALONE_MODE,
	HIRE_TUTOR,
	TUTOR_MSG,
	HIRE_TUTOR_BY_ID,
	SET_PARTNER,
	SET_PARTNER_ACTION,
	SET_PARTNER_FORCE_FLIP,
	SWITCH_RP,
	MOD_COMBO_RESPONSE,
	INC_COMBO_RESPONSE_BY_COMBO_RECHARGE,
	RADIO_SCHEDULE,
	OPEN_SKILL_GUIDE,
	NOTICE_MSG,
	CHAT_MSG,
	SET_UTIL_DLG,
	BUFF_ZONE_EFFECT,
	TIME_BOMB_ATTACK,
	EXPLOSION_ATTACK,
	PASSIVE_MOVE, // FOLLOW
	FOLLOW_CHARACTER_FAILED,
	SET_NEXT_SHOOT_EX_JABLIN,
	PREMIUM_ADVENTURER_ON_RESULT,
	GATHER_REQUEST_RESULT,
	RUNE_STONE_USE_ACK,
	OPEN_BAG,
	RANDOM_TELEPORT_KEY,
	PVP_ICEGAGE,
	IN_GAME_DIRECTION_EVENT,
	MEDAL_REISSUE_RESULT,
	DODGE_SKILL_READY,
	REMOVE_MICRO_BUFF_SKILL,
	VIDEO_BY_SCRIPT,
	REWARD_MOB_LIST_RESULT,
	INC_JUDGEMENT_STACK_RESPONSE,
	INC_CHARM_BY_CASH_PR_MSG,
	SET_BUFF_PROTECTOR,
	INC_LARKNESS_RESPONSE,
	DETONATE_BOMB,
	AGGRO_RANK_INFO_NAME,
	DEATH_COUNT_INFO,
	DEATH_COUNT_INFO_2,
	SET_DRESS_CHANGED,
	SEVER_ACK_MOB_ZONE_STATE_CHANGE,
	RANDOM_EMOTION,
	SET_FLIP_THE_COIN_ENABLED,
	TRICK_OR_TREAT_RESULT,
	GIANT_PET_BUFF,
	B2BODY_RESULT,
	SET_DEAD,
	OPEN_UI_ON_DEAD,
	EXPIRED_NOTICE,
	DO_LOTTERY_UI,
	ROULETTE_START,
	SIT_ON_TIME_CAPSULE,
	SIT_ON_DUMMY_PORTABLE_CHAIR,
	GO_MONSTER_FARM,
	MONSTER_LIFE_INVITE_ITEM_RESULT,
	PHOTO_GET_RESULT,
	FINAL_ATTACK_REQUEST,
	SET_GUN,
	SET_AMMO,
	CREATE_GUN,
	CLEAR_GUN,
	RESULT_SHOOT_ATTACK_IN_FPS_MODE,
	MIRROR_DUNGEON_ENTER_FAIL,
	MIRROR_DUNGEON_UNIT_CLEARED,
	REGISTER_MIRROR_DUNGEON_BOSS,
	MIRROR_DUNGEON_RECORD,
	OPEN_URL,
	ZERO_COMBAT_RECOVERY,
	MIRROR_STUDY_UI_OPEN,
	SKILL_COOLTIME_REDUCE,
	MIRROR_READING_UI_OPEN,
	USER_CTRL_MOB_SKILL_QPUSH,
	ZERO_LEVEL_UP_ALRAM,
	USER_CTRL_MOB_SKILL_QPOP,
	USER_CTRL_MOB_SKILL_FAIL,
	FORCE_SUMMONED_REMOVE,
	USER_RESPAWN,
	USER_CTRL_MOB_SKILL_FORCED_POP,
	ON_MONSTER_BATTLE_CAPTURE,
	IS_UNIVERSE,
	PORTAL_GROUP,
	SET_MOVABLE,
	USER_CTRL_MOB_SKILL_PUSH_COOLTIME,
	MOVE_PARTICLE_EFF,
	DO_ACTIVE_EVENT_SKILL_BY_SCRIPT,
	RUNE_STONE_SKILL_ACK,
	MOVE_TO_CONTENTS_CANNOT_MIGRATE,
	PLAY_AMBIENT_SOUND,
	STOP_AMBIENT_SOUND,
	FLAME_WIZARD_ELEMENT_FLAME_SUMMON,
	CAMERA_MODE,
	SPOT_LIGHT_TO_CHARACTER,
	BOSS_PARTY_CHECK_DONE,
	FREE_LOOK_CHANGE_UI_OPEN,
	FREE_LOOK_CHANGE_SUCCESS,
	GRAY_BACKGROUND,
	GET_NPC_CURRENT_ACTION,
	CAMERA_ROTATION,
	CAMERA_SWITCH,
	USER_SET_FIELD_FLOATING,
	ADD_POPUP_SAY,
	REMOVE_POPUP_SAY,
	JAGUAR_SKILL,
	ACTION_LAYER_RELMOVE,
	SEND_CLIENT_RESOLUTION,
	USER_BONUS_ATTACK_REQUEST,
	USER_RAND_AREA_ATTACK_REQUEST,
	JAGUAR_ACTIVE,
	SKILL_COOLTIME_SET_M,
	SET_CARRY_REACTOR_INFO,
	REACTOR_SKILL_USE_REQUEST,
	OPEN_BATTLE_PVP_CHAMP_SELECT_UI,
	BATTLE_PVP_ITEM_DROP_SOUND,
	SET_MESO_COUNT_BY_SCRIPT,
	PLANT_POT_CLICK_RESULT,
	PLANT_POT_EFFECT,
	DAMAGE_LOCAL,
	ROYAL_GUARD_ATTACK,
	DO_ACTIVE_PSYCHIC_AREA,
	ENTER_FIELD_PSYCHIC_INFO,
	LEAVE_FIELD_PSYCHIC_INFO,
	TOUCH_ME_STATE_RESULT,
	FIELD_SCORE_UPDATE,
	URUS_RESULT_UI_OPEN,
	SET_NO_MORE_LIFE,
	CREATE_AREA_DOT_INFO,

	MOVE_SCREEN_X,
	MOVE_SCREEN_DOWN,
	SEALED_BOX,
	SKILL_COOLTIME_SET,
	R_MESOBAG_SUCCESS,
	R_MESOBAG_FAILURE,
	MAP_FADE,
	MAP_FADE_FORCE,
	REGISTER_FAMILIAR,
	FAMILIAR_MESSAGE,
	CREATE_ULTIMATE,
	SWORD_ENERGY,

	// CSummonedPool::OnPacket
	SPAWN_SUMMON,
	REMOVE_SUMMON,
	MOVE_SUMMON,
	SUMMON_ATTACK,
	PVP_SUMMON,
	SUMMON_SKILL,
	SUMMON_SKILL_2,
	DAMAGE_SUMMON,

	// CMobPool::OnPacket
	SPAWN_MONSTER,
	KILL_MONSTER,
	SPAWN_MONSTER_CONTROL,

	// CMobPool::OnMobPacket
	MOVE_MONSTER,
	MOVE_MONSTER_RESPONSE,
	APPLY_MONSTER_STATUS,
	CANCEL_MONSTER_STATUS,
	DAMAGE_MONSTER,
	SKILL_EFFECT_MOB,
	TELE_MONSTER,
	MONSTER_SKILL,
	SHOW_MONSTER_HP,
	SHOW_MAGNET,
	ITEM_EFFECT_MOB,
	CATCH_MONSTER,
	MONSTER_PROPERTIES,
	REMOVE_TALK_MONSTER,
	TALK_MONSTER,
	CYGNUS_ATTACK,
	MONSTER_RESIST,
	MOB_TO_MOB_DAMAGE,
	AZWAN_MOB_TO_MOB_DAMAGE,
	AZWAN_SPAWN_MONSTER,
	AZWAN_KILL_MONSTER,
	AZWAN_SPAWN_MONSTER_CONTROL,

	// CNpcPool::OnPacket
	SPAWN_NPC,
	REMOVE_NPC,
	SPAWN_NPC_REQUEST_CONTROLLER,
	NPC_ACTION,
	NPC_TOGGLE_VISIBLE,
	INITIAL_QUIZ,
	NPC_UPDATE_LIMITED_INFO,
	NPC_SET_SPECIAL_ACTION,
	NPC_SCRIPTABLE,
	RED_LEAF_HIGH,

	// CEmployeePool::OnPacket
	SPAWN_HIRED_MERCHANT,
	DESTROY_HIRED_MERCHANT,
	UPDATE_HIRED_MERCHANT,

	// CDropPool::OnPacket
	ON_DROP_ENTER_FIELD,
	ON_DROP_LEAVE_FIELD,

	// CMessageBoxPool::OnPacket
	SPAWN_KITE_ERROR,
	SPAWN_KITE,
	DESTROY_KITE,

	// CAffectedAreaPool::OnPacket
	AFFECTED_AREA_CREATED,
	INSTALL_AREA_FIRE,
	AFFECTED_AREA_REMOVED,

	// CTownPortalPool::OnPacket
	TOWN_PORTAL_CREATED,
	TOWN_PORTAL_REMOVED,

	// CRandomPortalPool::OnPacket
	RANDOM_PORTAL_CREATED,
	SET_EXCL_REQUEST_SENT,
	RANDOM_PORTAL_REMOVED,

	// COpenGatePool::OnPacket
	OPEN_GATE_CREATED,
	OPEN_GATE_CLOSE,
	OPEN_GATE_REMOVED,

	// CReactorPool::OnPacket
	REACTOR_CHANGE_STATE,
	REACTOR_MOVE,
	REACTOR_ENTER_FIELD,
	REACTOR_RESET_STATE,
	REACTOR_OWNER_INFO,
	REACTOR_REMOVE,
	REACTOR_LEAVE_FIELD,

	// CFishingZonePool::OnPacket
	FISHING_INFO,
	FISHING_REWARD,
	FISHING_ZONE_INFO,

	// CExtractor::OnPacket
	SPAWN_EXTRACTOR,
	REMOVE_EXTRACTOR,

	// Snowball::OnPacket
	ROLL_SNOWBALL,
	HIT_SNOWBALL,
	SNOWBALL_MESSAGE,
	LEFT_KNOCK_BACK,

	// Coconut::OnPacket
	HIT_COCONUT,
	COCONUT_SCORE,
	MOVE_HEALER,
	PULLEY_STATE,

	// CField_MonsterCarnival::OnPacket
	MONSTER_CARNIVAL_START,
	MONSTER_CARNIVAL_OBTAINED_CP,
	MONSTER_CARNIVAL_STATS,
	MONSTER_CARNIVAL_SUMMON,
	MONSTER_CARNIVAL_MESSAGE,
	MONSTER_CARNIVAL_DIED,
	MONSTER_CARNIVAL_LEAVE,
	MONSTER_CARNIVAL_RESULT,
	MONSTER_CARNIVAL_RANKING,

	// CField_Witchtower::OnPacket
	WITCH_TOWER,

	// CField_PvP::OnPacket
	ENTER_PVP,
	CHANGE_TEAM,
	CHANGE_MODE,
	CHANGE_STATE,
	UPDATE_COUNT,
	SHOW_MODE_RESULT,
	UPDATE_TEAM_INFO,
	UPDATE_RANK_INFO,
	UPDATE_TEAM_SCORE,
	REVIVE_MESSAGE,
	SCREEN_EFFECT,
	ICEKNIGHT_HP_CHANGE,

	// CScriptMan::OnPacket
	SCRIPT_MESSAGE,

	// CShopDlg::OnPacket
	OPEN_NPC_SHOP,
	CONFIRM_SHOP_TRANSACTION,

	// CStoreBankDlg::OnPacket
	OPEN_STORAGE,
	MERCH_ITEM_MSG,
	MERCH_ITEM_STORE,

	// CCashShop::OnPacket
	CS_UPDATE,
	CS_OPERATION,
	PURCHASE_EXP_CHANGED,
	CS_MESO_UPDATE,
	GACHAPON_STAMPS,
	FREE_CASH_ITEM,
	CS_SURPRISE,
	XMAS_SURPRISE,
	CASH_SHOP,
	CASH_SHOP_UPDATE,
	ONE_A_DAY,

	// CFuncKeyMappedMan::OnPacket
	KEYMAP,
	PET_AUTO_HP,
	PET_AUTO_MP,
	PET_AUTO_CURE,

	// CMapleTVMan::OnPacket
	START_TV,
	REMOVE_TV,
	ENABLE_TV,

	// CMonsterFarm::OnPacket
	UPDATE_FARM_INVENTORY,
	CONSOLE_MESSAGE,
	OBJECT_INTERACT,
	OBJECT_CONSUME,
	RESULT_DICTIONARY,
	UPDATE_BUY_OBJECT,
	UPDATE_SEL_OBJECT,
	COMBINE_RESULT,
	FARM_MONSTER_SEARCH_RESULT,
	FARM_VISIT_RESULT,
	UPDATE_NEWS_FEED,
	UPDATE_DICTIONARY,
	AUTO_HARVEST_RESULT,
	SOUL_RECHARGE_RESULT,

	// CFarmUser::OnPacket
	SET_FARM_USER,
	SET_FARM_INVENTORY,
	SET_FARM_QUEST_ALL,
	QUEST_MESSAGE,
	NOTICE_MESSAGE,
	UPDATE_MONSTER_LIST,
	UPDATE_DECO,
	UPDATE_POINT,
	UPDATE_CASH,
	UPDATE_THEME,
	UPDATE_MONSTER_SLOT,
	UPDATE_MONSTER_LOCKER_SLOT,
	UPDATE_EXP,
	RESULT_CHECK_NAME,
	RESULT_CHECK_NAME_BY_CONSUME,
	RESULT_COMPLETE_QUEST,
	RESULT_GET_USER_PHOTO,
	RESULT_UPDATE_PHOTO,
	RESULT_REFULL_DAILY_QUEST,
	SEND_FARM_GIFT,
	SET_FRIEND_LIST,
	FRIEND_ONLINE_REFRESH,
	RESULT_ADD_FRIEND,
	RESULT_SEND_NOTICE,
	RESULT_LOAD_MAIN_LOG,
	RESULT_ADD_BLACKLIST,
	RESULT_FARM_USER_INFO_UI,
	SET_GUEST_OWNER_INFO,
	FARM_WHISPER,
	GROUP_MESSAGE_FARM,
	FARM_BROADCAST_MESSAGE,
	RESULT_NEW_LIST,
	SET_INGAME_INFO,
	FORCED_SHOP_OPEN,
	REQUEST_SET_INGAME_INFO,
	INGAME_FRIEND_REQUEST_RESULT,
	WORLD_WHISPER_RESULT,
	TOTAL_INFO,

	// CFarmMonsterPool::OnPacket
	ON_INSERT,
	ON_UPDATE,
	UPDATE_MY,
	SET_NAME_RESULT,
	CARE_RESULT,
	PLAY_RESULT,
	RELEASE_RESULT,
	LOCKER_RESULT,
	LIFE_EXTEND_RESULT,

	// Unplaced
	DEATH_COUNT,

	// Unknown
	SHOW_DAMAGE_SKIN,
	BOOSTER_PACK,
	BOOSTER_FAMILIAR,
	PET_FLAG_CHANGE,
	BUFF_BAR,
	CHAOS_ZAKUM_SHRINE,
	HORNTAIL_SHRINE,
	CAPTURE_FLAGS,
	CAPTURE_POSITION,
	CAPTURE_RESET,
	STRENGTHEN_UI,
	ALIEN_SOCKET_CREATOR,
	GOLDEN_HAMMER,
	RPS_GAME,
	MESSENGER,
	PLAYER_INTERACTION,
	VICIOUS_HAMMER,
	LOGOUT_GIFT,
	PACKAGE_OPERATION;
	private int code = -2;

    @Override
    public void setValue(int code) {
        this.code = code;
    }
    
    @Override
    public int getValue() {
        return code;
    }
    
    public static Properties getDefaultProperties() throws FileNotFoundException, IOException {
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("sendops"));
		props.load(fis);
		fis.close();
		return props;
	}
	
	static {
		try {
			ExternalCodeTableGetter.populateValues(getDefaultProperties(), values());
		} catch (IOException e) {
			throw new RuntimeException("Failed to load sendops", e);
		}
	}
	
	public static String getNameByValue(int value) {
		for (SendPacketOpcode opcode : SendPacketOpcode.values()) {
			if (opcode.getValue() == value) {
				return opcode.name();
			}
		}
		return "UNKNOWN";
	}
}
