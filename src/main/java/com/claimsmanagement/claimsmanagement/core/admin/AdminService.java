package com.claimsmanagement.claimsmanagement.core.admin;

import com.claimsmanagement.claimsmanagement.core.claim.web.ClaimView;
import com.claimsmanagement.claimsmanagement.core.member.web.MemberView;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;

public interface AdminService {

    Page<ClaimView> getAllClaims(@PageableDefault(sort = "claimRaisedDate", direction = Sort.Direction.ASC)
                                 Pageable pageable);

    Page<MemberView> getAllMembers(@PageableDefault(sort = "memberId", direction = Sort.Direction.DESC)
                                   Pageable pageable);

    void processClaim();
}
